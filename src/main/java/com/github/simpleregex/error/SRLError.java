package com.github.simpleregex.error;

import org.antlr.v4.runtime.Token;

/**
 * Created by samuelt on 08/09/2016.
 */
public class SRLError extends Exception {

    public final Token token;
    public final FileLocation location;
    public final String message;

    public SRLError(Token token, FileLocation location, String message) {
        this.token = token;
        this.location = location;
        this.message = message;
    }
}
