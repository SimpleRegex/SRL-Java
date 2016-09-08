package com.github.simpleregex;

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

    private final SRLCompiler compiler;
    private final Pattern pattern;

    public SRL(SRLCompiler compiler) {
        this.compiler = compiler;
        this.compiler.parse();
        this.pattern = Pattern.compile(this.compiler.generate());
    }

    public SRL(String input) {
        this(new SRLCompiler(input));
    }

    public SRL(Path filePath) throws IOException {
        this(fileToString(filePath));
    }

    public SRL(File file) throws IOException {
        this(file.toPath());
    }

    private static String fileToString(Path filePath) throws IOException {
        StringBuilder sb = new StringBuilder("");
        for (String line : Files.readAllLines(filePath)) sb.append(line).append("\n");
        return sb.toString();
    }

}
