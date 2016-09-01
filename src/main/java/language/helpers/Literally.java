package main.java.language.helpers;

/**
 * Created by marco on 31/08/16.
 */
public class Literally {

    /** @var string The literal string. */
    protected String string = "";

    public Literally(String string)
    {
        this.string = string.replace("\\","");
    }

    /**
     * @return string
     */
    public String getString()
    {
        return this.string;
    }
}
