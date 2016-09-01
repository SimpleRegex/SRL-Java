package main.java.builder;

import main.java.Builder;

/**
 * Created by marco on 31/08/16.
 */
public class  NegativeLookahead extends Builder
{
    /** @var string Desired lookahead group. */
    protected String group = "(?!%s)";
}