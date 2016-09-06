package com.github.simpleregex;

import com.github.simpleregex.parser.SRLBaseListener;
import com.github.simpleregex.parser.SRLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by samtebbs on 06/09/2016.
 */
public class SRLParseTreeListener extends SRLBaseListener {

    enum RegexElement {
        GROUP("(?:", ")"),
        CASE_INSENSITIVE("i"),
        ALL_LAZY("U"),
        MULTI_LINE("m"),
        END_OF_STRING("$"),
        START_OF_STRING("^"),
        IF_FOLLOWED("(?=", ")"),
        IF_NOT_FOLLOWED("(?!", ")"),
        IF_HAD("(?<=", ")"),
        IF_NOT_HAD("(?<!", ")");
        final String start, end, str;

        private RegexElement(String start, String end) {
            this.str = "";
            this.start = start;
            this.end = end;
        }

        RegexElement(String str) {
            this.str = str;
            this.start = "";
            this.end = "";
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

}
