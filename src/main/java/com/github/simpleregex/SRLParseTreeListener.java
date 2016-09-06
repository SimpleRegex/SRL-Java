package com.github.simpleregex;

import com.github.simpleregex.parser.SRLBaseListener;
import com.github.simpleregex.parser.SRLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.function.Consumer;

/**
 * Created by samtebbs on 06/09/2016.
 */
public class SRLParseTreeListener extends SRLBaseListener {

    enum RegexElement {
        GROUP("(?:", ")");
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

    StringBuffer result = new StringBuffer();

    public String generate(SRLParser.QueryContext query) {
        result = new StringBuffer();
        ParseTreeWalker.DEFAULT.walk(this, query);
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
        visit(ctx.character_stmt(), this::enterCharacter_stmt);
        visit(ctx.group_stmt(), this::enterGroup_stmt);

    }
}
