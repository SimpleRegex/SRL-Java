package com.github.simpleregex;

import com.github.simpleregex.parser.SRLLexer;
import com.github.simpleregex.parser.SRLListener;
import com.github.simpleregex.parser.SRLParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by samtebbs on 04/09/2016.
 */
public class SRLCompiler {

    protected SRLLexer lexer;
    protected SRLParser parser;
    private SRLParser.QueryContext tree;

    public SRLCompiler(String input) {
        lexer = new SRLLexer(new ANTLRInputStream(input));
        parser = new SRLParser(new CommonTokenStream(lexer));
    }

    public void parse() {
        tree = parser.query(); // parse a start rule
    }

    public String generate() {
        return new SRLParseTreeListener().generate(tree);
    }

}
