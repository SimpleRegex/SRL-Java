package com.github.simpleregex;

import com.github.simpleregex.error.SRLSyntaxError;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by samtebbs on 04/09/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException, SRLSyntaxError {
        StringBuilder sb = new StringBuilder("");
        for (String line : Files.readAllLines(Paths.get(args[0]))) sb.append(line).append("\n");
        SRLCompiler compiler = new SRLCompiler(sb.toString());
        compiler.parse();
        System.out.println(compiler.generate());
    }

}
