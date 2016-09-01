package main.java.builder;

import main.java.Builder;


/**
 * Created by marco on 31/08/16.
 */
public class Capture extends Builder {

    /** @var string Desired match group. */
    protected String group = "(%s)";

    /**
     * Set name for capture group.
     *
     * @param  name
     */
    public void setName(String name)
    {
        group = "(?<"+name+">%s)";
    }
}
