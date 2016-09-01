package main.java.builder;

import main.java.Builder;

/**
 * Created by marco on 31/08/16.
 */
public class NegativeLookbehind extends Builder
{
    /** @var string Desired lookbehind group. */
    protected String group = "(?<!%s)";
}
