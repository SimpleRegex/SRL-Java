package com.github.simpleregex;

import com.github.simpleregex.error.SRLSyntaxError;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

/**
 * Created by samuelt on 08/09/2016.
 */
public class SRL {

    public final SRLCompiler compiler;
    public final Pattern pattern;

    public SRL(SRLCompiler compiler) throws SRLSyntaxError {
        this.compiler = compiler;
        this.compiler.parse();
        this.pattern = Pattern.compile(this.compiler.generate());
    }

    public SRL(String input) throws SRLSyntaxError {
        this(new SRLCompiler(input));
    }

    public SRL(Path filePath) throws IOException, SRLSyntaxError {
        this(fileToString(filePath));
    }

    public SRL(File file) throws IOException, SRLSyntaxError {
        this(file.toPath());
    }

    private static String fileToString(Path filePath) throws IOException {
        StringBuilder sb = new StringBuilder("");
        for (String line : Files.readAllLines(filePath)) sb.append(line).append("\n");
        return sb.toString();
    }

}
