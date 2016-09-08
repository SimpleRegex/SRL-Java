package com.github.simpleregex;

import com.github.simpleregex.error.FileLocation;
import com.github.simpleregex.error.SRLError;
import com.github.simpleregex.error.SRLErrorListener;
import com.github.simpleregex.parser.SRLLexer;
import com.github.simpleregex.parser.SRLListener;
import com.github.simpleregex.parser.SRLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.BitSet;

/**
 * Created by samtebbs on 04/09/2016.
 */
public class SRLCompiler {

    protected SRLLexer lexer;
    protected SRLParser parser;
    private SRLParser.QueryContext tree;

    private static SRLErrorListener defaultErrorListener = error -> {
        String msg = error.message;
        if(msg.startsWith("no viable")) msg = String.format("Unrecognised input \'%s\'", error.token.getText());
        System.err.printf("Syntax error [%d:%d-%d] %s%n", error.location.line, error.location.column, error.location.getEndColumn(), msg);
    };

    public SRLCompiler(String input) {
        lexer = new SRLLexer(new ANTLRInputStream(input));
        parser = new SRLParser(new CommonTokenStream(lexer));
    }

    public void parse() {
        removeErrorListeners();
        addErrorListener(defaultErrorListener);
        tree = parser.query();
    }

    public String generate() {
        return new SRLParseTreeListener().generate(tree);
    }

    public void removeErrorListeners() {
        parser.removeErrorListeners();
    }

    public void addErrorListener(SRLErrorListener listener) {
        parser.addErrorListener(listener);
    }

}
