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


    private void add(String str) {
        System.out.println("adding " + str);
        result.append(str);
    }

    private void addRegexStart(RegexElement elem) {
        add(elem.start);
    }

    private void addRegexEnd(RegexElement elem) {
        add(elem.end);
    }

    private void addRegexVal(RegexElement elem) {
        add(elem.str);
    }

    @Override
    public void enterQuery(SRLParser.QueryContext ctx) {
        enterStmts(ctx.stmts());
    }

    @Override
    public void enterStmts(SRLParser.StmtsContext ctx) {
        addRegexStart(RegexElement.GROUP);
        ctx.stmt().forEach(this::enterStmt);
        addRegexEnd(RegexElement.GROUP);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        add(node.getText());
    }

    @Override
    public void enterStmt(SRLParser.StmtContext ctx) {
        addRegexStart(RegexElement.GROUP);
        visit(ctx.flag(), this::enterFlag);
        visit(ctx.anchor(), this::enterAnchor);
        if(ctx.if_stmt() != null) {
            enterConditionalStmt(ctx.if_stmt(), ctx.stmt());
        }
        visit(ctx.quantifiable_stmt(), this::enterQuantifiable_stmt);
        addRegexEnd(RegexElement.GROUP);
        visit(ctx.quantifier(), this::enterQuantifier);
    }

    @Override
    public void enterQuantifier(SRLParser.QuantifierContext ctx) {
        visit(ctx.at_least(), this::enterAt_least);
        visit(ctx.between(), this::enterBetween);
        visit(ctx.exactly(), this::enterExactly);
        visit(ctx.or_more(), this::enterOr_more);
        if(ctx.KEYW_OPTIONAL() != null) addRegexVal(RegexElement.OPTIONAL);
    }

    @Override
    public void enterAt_least(SRLParser.At_leastContext ctx) {
        addRegexStart(RegexElement.AT_LEAST);
        visitTerminal(ctx.DIGIT());
        addRegexEnd(RegexElement.AT_LEAST);
    }

    @Override
    public void enterBetween(SRLParser.BetweenContext ctx) {
        addRegexStart(RegexElement.BETWEEN);
        visitTerminal(ctx.DIGIT(0));
        addRegexVal(RegexElement.BETWEEN);
        visitTerminal(ctx.DIGIT(1));
        addRegexEnd(RegexElement.BETWEEN);
    }

    @Override
    public void enterExactly(SRLParser.ExactlyContext ctx) {
        addRegexStart(RegexElement.EXACTLY);
        visitTerminal(ctx.DIGIT());
        addRegexEnd(RegexElement.EXACTLY);
    }

    @Override
    public void enterOr_more(SRLParser.Or_moreContext ctx) {
        RegexElement element = ctx.KEYW_ONCE() != null ? RegexElement.ONCE_OR_MORE : RegexElement.NEVER_OR_MORE;
        addRegexVal(element);
    }

    private void enterConditionalStmt(SRLParser.If_stmtContext ifStmt, SRLParser.StmtContext stmt) {
        if(ifStmt.KEYW_HAD() != null) {
            RegexElement ifRegex = ifStmt.KEYW_NOT() != null ? RegexElement.IF_NOT_HAD : RegexElement.IF_HAD;
            addRegexStart(ifRegex);
            enterBlock(ifStmt.block());
            addRegexEnd(ifRegex);
        }
        enterStmt(stmt);
        if(ifStmt.KEYW_FOLLOWED() != null){
            RegexElement ifRegex = ifStmt.KEYW_NOT() != null ? RegexElement.IF_NOT_FOLLOWED : RegexElement.IF_FOLLOWED;
            addRegexStart(ifRegex);
            enterBlock(ifStmt.block());
            addRegexEnd(ifRegex);
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
        if(ctx.KEYW_END() != null) addRegexVal(RegexElement.END_OF_STRING);
        else if(ctx.KEYW_BEGINS() != null | ctx.KEYW_STARTS() != null) addRegexVal(RegexElement.START_OF_STRING);
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
        if(ctx.KEYW_DIGIT() != null) addRegexVal(RegexElement.DIGIT);
        else if(ctx.KEYW_ANYHTING() != null) addRegexVal(RegexElement.ANYTHING);
        else if(ctx.KEYW_LINE() != null) addRegexVal(RegexElement.NEW_LINE);
        else if(ctx.KEYW_WHITESPACE() != null) {
            RegexElement elem = ctx.KEYW_NO() != null ? RegexElement.NO_WHITESPACE : RegexElement.WHITESPACE;
            addRegexVal(elem);
        } else if(ctx.KEYW_TAB() != null) addRegexVal(RegexElement.TAB);
        else if(ctx.KEYW_RAW() != null) visitTerminal(ctx.STRING());
    }

    @Override
    public void enterLiterally(SRLParser.LiterallyContext ctx) {
        visitTerminal(ctx.STRING());
    }

    @Override
    public void enterLetter(SRLParser.LetterContext ctx) {
        RegexElement elem = ctx.KEYW_UPPERCASE() != null ? RegexElement.UPPERCASE_LETTER : RegexElement.LOWERCASE_LETTER;
        addRegexVal(elem);
    }

    @Override
    public void enterOf(SRLParser.OfContext ctx) {
        RegexElement elem = ctx.KEYW_ANY() != null ? RegexElement.ANY_OF : RegexElement.ONE_OF;
        addRegexStart(elem);
        visitTerminal(ctx.STRING());
        addRegexEnd(elem);
    }

    @Override
    public void enterCharacter(SRLParser.CharacterContext ctx) {
        RegexElement elem = ctx.KEYW_ANY() != null ? RegexElement.ANY_CHARACTER : RegexElement.NO_CHARACTER;
        addRegexVal(elem);
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
        addRegexStart(RegexElement.FROM);
        visitTerminal(start);
        addRegexVal(RegexElement.FROM);
        visitTerminal(end);
        addRegexEnd(RegexElement.FROM);
    }

    @Override
    public void enterCharacter_stmt(SRLParser.Character_stmtContext ctx) {
        visit(ctx.provider(), this::enterProvider);
        visit(ctx.specification(), this::enterSpecification);
    }

    @Override
    public void enterIf_stmt(SRLParser.If_stmtContext ctx) {
        // Implemented in enterConditional_stmt()
    }

    @Override
    public void enterBlock(SRLParser.BlockContext ctx) {
        if(ctx.STRING() != null) visitTerminal(ctx.STRING());
        else {
            addRegexStart(RegexElement.GROUP);
            visit(ctx.stmt(), this::enterStmt);
            visit(ctx.stmts(), this::enterStmts);
            addRegexEnd(RegexElement.GROUP);
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
            addRegexStart(RegexElement.CAPTURE_AS);
            visitTerminal(ctx.STRING());
            addRegexVal(RegexElement.CAPTURE_AS);
        } else addRegexStart(RegexElement.CAPTURE);
        visit(ctx.block(0), this::enterBlock);
        addRegexEnd(RegexElement.CAPTURE);
        if(ctx.KEYW_UNTIL() != null) visit(ctx.block(1), this::enterBlock);
    }

    @Override
    public void enterAny_of(SRLParser.Any_ofContext ctx) {
        addRegexStart(RegexElement.GROUP);
        SRLParser.BlockContext block = ctx.block();
        if(block.STRING() != null) visitTerminal(block.STRING());
        else {
            visit(block.stmt(), this::enterStmt);
            List<SRLParser.StmtContext> stmts = block.stmts().stmt();
            if(stmts.size() > 0) {
                visit(stmts.get(0), this::enterStmt);
                for (int i = 1; i < stmts.size(); i++) {
                    addRegexVal(RegexElement.SELECTION);
                    visit(stmts.get(i), this::enterStmt);
                }
            }
        }
        addRegexEnd(RegexElement.GROUP);
    }

}
