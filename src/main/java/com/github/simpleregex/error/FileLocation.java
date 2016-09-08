package com.github.simpleregex.error;

import org.antlr.v4.runtime.Token;

/**
 * Created by samuelt on 08/09/2016.
 */
public class FileLocation {

    public final int line, column, length;

    public FileLocation(int line, int column, int length) {
        this.line = line;
        this.column = column;
        this.length = length;
    }

    public FileLocation(Token token) {
        this(token.getLine(), token.getCharPositionInLine(), token.getText().length());
    }

    public int getEndColumn() {
        return column + length;
    }

}
