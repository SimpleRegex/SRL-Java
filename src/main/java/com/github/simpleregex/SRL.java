package com.github.simpleregex;

import com.github.simpleregex.error.SRLSyntaxError;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by samuelt on 08/09/2016.
 */
public class SRL {

    private final String regExpr;
    private final String modifiers;
    public final SRLCompiler compiler;
    public final Pattern pattern;

    private SRL(SRLCompiler compiler) throws SRLSyntaxError {
        this.compiler = compiler;
        this.compiler.parse();
        this.regExpr=this.compiler.generate();
        String[] regExpressionArray=regExpr.split("/");
        this.modifiers=regExpressionArray[regExpressionArray.length-1];
        this.pattern = Pattern.compile(String.join("", Arrays.copyOfRange(regExpressionArray,1,regExpressionArray.length-1)),getCompileModifiers());
    }

    private int getCompileModifiers(){
        int compileModifier=0;
        if(modifiers.contains("i")){
            compileModifier|=Pattern.CASE_INSENSITIVE;
        }
        if(modifiers.contains("m")){
            compileModifier|=Pattern.MULTILINE;
        }

        return compileModifier;
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

    public boolean isMatching(String stringToMatch){
        return getMatcher(stringToMatch).matches();
    }

    private Matcher getMatcher(String stringToMatch){
        return this.pattern.matcher(stringToMatch);
    }

    public String getRegExpr(){
        return this.regExpr;
    }

    public String getModifiers(){
        return this.modifiers;
    }



}
