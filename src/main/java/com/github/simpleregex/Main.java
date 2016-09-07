package com.github.simpleregex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by samtebbs on 04/09/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder("");

        SRLCompiler compiler = new SRLCompiler("capture (digit) if not followed by (anything once or more, digit)");
        compiler.parse();
        compiler.analyse();

        System.out.println(compiler.generate());
    }

}
