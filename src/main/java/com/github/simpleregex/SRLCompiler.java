package com.github.simpleregex;

import com.github.simpleregex.parser.SRLLexer;
import com.github.simpleregex.parser.SRLListener;
import com.github.simpleregex.parser.SRLParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.TreeWizard;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by samtebbs on 04/09/2016.
 */
public class SRLCompiler {

    protected SRLLexer lexer;
    protected SRLParser parser;
    private SRLParser.QueryContext tree;

    public SRLCompiler(String input) {
        CharStream stream = new ANTLRInputStream(input);
        lexer = new SRLLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);

        // Prepare the parser
        parser = new SRLParser(tokenStream);
        //parser.setTrace(true);
    }

    public void parse() {
        tree = parser.query(); // parse a start rule
    }

    public void analyse() {
        SRLListener listener = new SRLParseTreeListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
    }

    public String generate() {
        return "";
    }

}
