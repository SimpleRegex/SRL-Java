package com.github.simpleregex;

import com.github.simpleregex.parser.SRLBaseListener;
import com.github.simpleregex.parser.SRLParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by samtebbs on 06/09/2016.
 */
public class SRLParseTreeListener extends SRLBaseListener {

    StringBuffer result = new StringBuffer();

    public String generate(SRLParser.QueryContext query) {
        result = new StringBuffer();
        ParseTreeWalker.DEFAULT.walk(this, query);
        return result.toString();
    }

    @Override
    public void enterQuery(SRLParser.QueryContext ctx) {
        super.enterQuery(ctx);
    }

}
