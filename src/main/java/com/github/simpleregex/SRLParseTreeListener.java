package com.github.simpleregex;

import com.github.simpleregex.parser.SRLBaseListener;
import com.github.simpleregex.parser.SRLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by samtebbs on 06/09/2016.
 */
public class SRLParseTreeListener extends SRLBaseListener {

    enum RegexElement {
        FROM("[", "-", "]"),
        GROUP("(?:", ")"),
        OPTIONAL("?"),
        CAPTURE("(", ")"),
        CAPTURE_AS("?<", ">(", ")"),
        CASE_INSENSITIVE("i"),
        AT_LEAST("{", ",}"),
        BETWEEN("{", ",", "}"),
        EXACTLY("{", "}"),
        NEVER_OR_MORE("*"),
        ONCE_OR_MORE("+"),
        DIGIT("[0-9]"),
        NEW_LINE("\\n"),
        TAB("\\t"),
        ONE_OF("[", "]"),
        ANY_OF("(?:", ")"),
        SELECTION("|"),
        ANY_CHARACTER("\\W"),
        NO_CHARACTER("\\w"),
        NO_WHITESPACE("\\S"),
        WHITESPACE("\\s"),
        UPPERCASE_LETTER("[A-Z]"),
        LOWERCASE_LETTER("[a-z]"),
        ANYTHING("."),
        ALL_LAZY("U"),
        MULTI_LINE("m"),
        END_OF_STRING("$"),
        START_OF_STRING("^"),
        IF_FOLLOWED("(?=", ")"),
        IF_NOT_FOLLOWED("(?!", ")"),
        IF_HAD("(?<=", ")"),
        IF_NOT_HAD("(?<!", ")");
        final String start, end, str;

        RegexElement(String start, String str, String end) {
            this.str = str;
            this.start = start;
            this.end = end;
        }

        RegexElement(String start, String end) {
            this(start, "", end);
        }

        RegexElement(String str) {
            this("", str, "");
        }
    }

    StringBuffer result = new StringBuffer("/");
    List<RegexElement> flags = new LinkedList<>();

    public String generate(SRLParser.QueryContext query) {
        result = new StringBuffer();
        ParseTreeWalker.DEFAULT.walk(this, query);
        result.append("/");
        flags.forEach(flag -> result.append(flag.str));
        return result.toString();
    }

    private <T extends ParserRuleContext> void visit(T ctx, Consumer<T> visitor) {
        if(ctx != null) visitor.accept(ctx);
    }

    @Override
    public void enterQuery(SRLParser.QueryContext ctx) {
        enterStmts(ctx.stmts());
    }

    @Override
    public void enterStmts(SRLParser.StmtsContext ctx) {
        result.append(RegexElement.GROUP.start);
        ctx.stmt().forEach(this::enterStmt);
        result.append(RegexElement.GROUP.end);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        result.append(node.getText());
    }

    @Override
    public void enterStmt(SRLParser.StmtContext ctx) {
        result.append(RegexElement.GROUP.start);
        visit(ctx.flag(), this::enterFlag);
        visit(ctx.anchor(), this::enterAnchor);
        if(ctx.if_stmt() != null) {
            enterConditionalStmt(ctx.if_stmt(), ctx.stmt());
        }
        visit(ctx.quantifiable_stmt(), this::enterQuantifiable_stmt);
        result.append(RegexElement.GROUP.end);
        visit(ctx.quantifier(), this::enterQuantifier);
    }

    @Override
    public void enterQuantifier(SRLParser.QuantifierContext ctx) {
        visit(ctx.at_least(), this::enterAt_least);
        visit(ctx.between(), this::enterBetween);
        visit(ctx.exactly(), this::enterExactly);
        visit(ctx.or_more(), this::enterOr_more);
        if(ctx.KEYW_OPTIONAL() != null) result.append(RegexElement.OPTIONAL.str);
    }

    @Override
    public void enterAt_least(SRLParser.At_leastContext ctx) {
        result.append(RegexElement.AT_LEAST.start);
        visitTerminal(ctx.DIGIT());
        result.append(RegexElement.AT_LEAST.end);
    }

    @Override
    public void enterBetween(SRLParser.BetweenContext ctx) {
        result.append(RegexElement.BETWEEN.start);
        visitTerminal(ctx.DIGIT(0));
        result.append(RegexElement.BETWEEN.str);
        visitTerminal(ctx.DIGIT(1));
        result.append(RegexElement.BETWEEN.end);
    }

    @Override
    public void enterExactly(SRLParser.ExactlyContext ctx) {
        result.append(RegexElement.EXACTLY.start);
        visitTerminal(ctx.DIGIT());
        result.append(RegexElement.EXACTLY.end);
    }

    @Override
    public void enterOr_more(SRLParser.Or_moreContext ctx) {
        RegexElement element = ctx.KEYW_ONCE() != null ? RegexElement.ONCE_OR_MORE : RegexElement.NEVER_OR_MORE;
        result.append(element.str);
    }

    private void enterConditionalStmt(SRLParser.If_stmtContext ifStmt, SRLParser.StmtContext stmt) {
        if(ifStmt.KEYW_HAD() != null) {
            RegexElement ifRegex = ifStmt.KEYW_NOT() != null ? RegexElement.IF_NOT_HAD : RegexElement.IF_HAD;
            result.append(ifRegex.start);
            enterBlock(ifStmt.block());
            result.append(ifRegex.end);
        }
        enterStmt(stmt);
        if(ifStmt.KEYW_FOLLOWED() != null){
            RegexElement ifRegex = ifStmt.KEYW_NOT() != null ? RegexElement.IF_NOT_FOLLOWED : RegexElement.IF_FOLLOWED;
            result.append(ifRegex.start);
            enterBlock(ifStmt.block());
            result.append(ifRegex.end);
        }
    }

    @Override
    public void enterFlag(SRLParser.FlagContext ctx) {
        if(ctx.KEYW_CASE() != null) flags.add(RegexElement.CASE_INSENSITIVE);
        else if(ctx.KEYW_LAZY() != null) flags.add(RegexElement.ALL_LAZY);
        else if(ctx.KEYW_MULTI() != null) flags.add(RegexElement.MULTI_LINE);
    }

    @Override
    public void enterAnchor(SRLParser.AnchorContext ctx) {
        if(ctx.KEYW_END() != null) result.append(RegexElement.END_OF_STRING.str);
        else if(ctx.KEYW_BEGINS() != null | ctx.KEYW_STARTS() != null) result.append(RegexElement.START_OF_STRING.str);
    }

    @Override
    public void enterQuantifiable_stmt(SRLParser.Quantifiable_stmtContext ctx) {
        visit(ctx.character_stmt(), this::enterCharacter_stmt);
        visit(ctx.if_stmt(), this::enterIf_stmt);
        visit(ctx.group_stmt(), this::enterGroup_stmt);
        visit(ctx.stmt(), this::enterStmt);
    }

    @Override
    public void enterProvider(SRLParser.ProviderContext ctx) {
        visit(ctx.literally(), this::enterLiterally);
        visit(ctx.character(), this::enterCharacter);
        visit(ctx.letter(), this::enterLetter);
        visit(ctx.of(), this::enterOf);
        if(ctx.KEYW_DIGIT() != null) result.append(RegexElement.DIGIT.str);
        else if(ctx.KEYW_ANYHTING() != null) result.append(RegexElement.ANYTHING.str);
        else if(ctx.KEYW_LINE() != null) result.append(RegexElement.NEW_LINE.str);
        else if(ctx.KEYW_WHITESPACE() != null) {
            RegexElement elem = ctx.KEYW_NO() != null ? RegexElement.NO_WHITESPACE : RegexElement.WHITESPACE;
            result.append(elem.str);
        } else if(ctx.KEYW_TAB() != null) result.append(RegexElement.TAB.str);
        else if(ctx.KEYW_RAW() != null) result.append(ctx.STRING());
    }

    @Override
    public void enterLiterally(SRLParser.LiterallyContext ctx) {
        visitTerminal(ctx.STRING());
    }

    @Override
    public void enterLetter(SRLParser.LetterContext ctx) {
        RegexElement elem = ctx.KEYW_UPPERCASE() != null ? RegexElement.UPPERCASE_LETTER : RegexElement.LOWERCASE_LETTER;
        result.append(elem.str);
    }

    @Override
    public void enterOf(SRLParser.OfContext ctx) {
        RegexElement elem = ctx.KEYW_ANY() != null ? RegexElement.ANY_OF : RegexElement.ONE_OF;
        result.append(elem.start);
        visitTerminal(ctx.STRING());
        result.append(elem.end);
    }

    @Override
    public void enterCharacter(SRLParser.CharacterContext ctx) {
        RegexElement elem = ctx.KEYW_ANY() != null ? RegexElement.ANY_CHARACTER : RegexElement.NO_CHARACTER;
        result.append(elem.str);
    }

    @Override
    public void enterSpecification(SRLParser.SpecificationContext ctx) {
        TerminalNode start, end;
        if(ctx.CHAR().size() > 0) {
            start = ctx.CHAR(0);
            end = ctx.CHAR(1);
        } else {
            start = ctx.DIGIT(0);
            end = ctx.DIGIT(1);
        }
        result.append(RegexElement.FROM.start);
        visitTerminal(start);
        result.append(RegexElement.FROM.str);
        visitTerminal(end);
        result.append(RegexElement.FROM.end);
    }

    @Override
    public void enterCharacter_stmt(SRLParser.Character_stmtContext ctx) {
        visit(ctx.provider(), this::enterProvider);
        visit(ctx.specification(), this::enterSpecification);
    }

    @Override
    public void enterIf_stmt(SRLParser.If_stmtContext ctx) {
        // Implemented elsewhere
    }

    @Override
    public void enterBlock(SRLParser.BlockContext ctx) {
        if(ctx.STRING() != null) visitTerminal(ctx.STRING());
        else {
            result.append(RegexElement.GROUP.start);
            visit(ctx.stmt(), this::enterStmt);
            visit(ctx.stmts(), this::enterStmts);
            result.append(RegexElement.GROUP.end);
        }
    }

    @Override
    public void enterGroup_stmt(SRLParser.Group_stmtContext ctx) {
        visit(ctx.capture(), this::enterCapture);
        visit(ctx.any_of(), this::enterAny_of);
    }

    @Override
    public void enterCapture(SRLParser.CaptureContext ctx) {
        if(ctx.KEYW_AS() != null) {
            result.append(RegexElement.CAPTURE_AS.start);
            visitTerminal(ctx.STRING());
            result.append(RegexElement.CAPTURE_AS.str);
        } else result.append(RegexElement.CAPTURE.start);
        visit(ctx.block(0), this::enterBlock);
        result.append(RegexElement.CAPTURE.end);
        if(ctx.KEYW_UNTIL() != null) visit(ctx.block(1), this::enterBlock);
    }

    @Override
    public void enterAny_of(SRLParser.Any_ofContext ctx) {
        result.append(RegexElement.GROUP.start);
        SRLParser.BlockContext block = ctx.block();
        if(block.STRING() != null) visitTerminal(block.STRING());
        else {
            visit(block.stmt(), this::enterStmt);
            List<SRLParser.StmtContext> stmts = block.stmts().stmt();
            if(stmts.size() > 0) {
                visit(stmts.get(0), this::enterStmt);
                for (int i = 1; i < stmts.size(); i++) {
                    result.append(RegexElement.SELECTION.str);
                    visit(stmts.get(i), this::enterStmt);
                }
            }
        }
    }

}
