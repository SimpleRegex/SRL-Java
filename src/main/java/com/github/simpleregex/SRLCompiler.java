package com.github.simpleregex;

import com.github.simpleregex.error.FileLocation;
import com.github.simpleregex.error.SRLSyntaxError;
import com.github.simpleregex.parser.SRLLexer;
import com.github.simpleregex.parser.SRLParser;
import org.antlr.v4.runtime.*;

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

    public void parse() throws SRLSyntaxError {
        try {
            tree = parser.query();
        } catch (RecognitionException e) {
            throw new SRLSyntaxError(e.getOffendingToken(), new FileLocation(e.getOffendingToken()), e.getMessage());
        }
    }

    public String generate() {
        return new SRLParseTreeListener().generate(tree);
    }

}
