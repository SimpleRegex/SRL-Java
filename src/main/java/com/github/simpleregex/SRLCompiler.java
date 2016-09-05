package com.github.simpleregex;

import com.github.simpleregex.parser.SRLBaseVisitor;
import com.github.simpleregex.parser.SRLLexer;
import com.github.simpleregex.parser.SRLParser;
import com.github.simpleregex.parser.SRLParserVisitor;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.tree.TreeWizard;
import org.antlr.v4.runtime.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by samtebbs on 04/09/2016.
 */
public class SRLCompiler {

    protected SRLLexer lexer;
    protected SRLParser parser;
    private SRLParser.StmtsContext tree;

    public SRLCompiler(String input) {
        CharStream stream = new ANTLRInputStream(input);
        lexer = new SRLLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);

        // Prepare the parser
        parser = new SRLParser(tokenStream);
        parser.setTrace(true);
    }

    public void parse() {
        tree = parser.stmts(); // parse a start rule
    }

    public void analyse() {
        SRLParserVisitor visitor = new SRLParserVisitor();
        visitor.visitStmts(tree);
    }

    public String generate() {
        return "";
    }

}
