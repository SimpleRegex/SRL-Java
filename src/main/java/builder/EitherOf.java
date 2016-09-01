package main.java.builder;

import main.java.Builder;


/**
 * Created by marco on 31/08/16.
 */
public class EitherOf extends Builder
{
    /** @var string Desired match group. */
    protected String group = "(?:%s)";

    /** @var string String to implode with. */
    protected String  implodeString = "|";
}