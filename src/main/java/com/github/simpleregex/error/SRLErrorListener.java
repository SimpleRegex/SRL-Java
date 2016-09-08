package com.github.simpleregex.error;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

/**
 * Created by samuelt on 08/09/2016.
 */
public interface SRLErrorListener extends ANTLRErrorListener {

    public void error(SRLError error);

    @Override
    public default void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        Token token = (Token) o;
        error(new SRLError(token, new FileLocation(token), s));
    }

    @Override
    public default void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {}

    @Override
    public default void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {}

    @Override
    public default void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {}

}
