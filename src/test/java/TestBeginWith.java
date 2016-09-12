import com.github.simpleregex.error.SRLSyntaxError;
import junit.framework.TestCase;

/**
 * Created by marco on 07/09/16.
 */
public class TestBeginWith extends TestCase {

    /**
     * Test method begin with that accept one digit
     */
    public void testBeginWithDigit() throws SRLSyntaxError {
        assertEquals("/^[0-9]/", Util.toRegex("begin with digit"));
    }

    /**
     * Test method begin with that accept one character
     * Example: a,b,c
     */
    public void testBeginWithLetter() throws SRLSyntaxError {
        assertEquals("/^[a-z]/", Util.toRegex("begin with letter"));
    }

    /**
     * Test method begin with one letter or one digit
     * Example: 1b
     */
    public void testBeginWithOneLetterOrOneDigit() throws SRLSyntaxError {
        assertEquals("/^(?:[a-z][0-9])/", Util.toRegex("begin with (letter,digit)"));
    }

    /**
     * Test method begin with letter and digit one or more
     *
     * Example: a1,b5h7
     *
     */
    public void testBeginWithLetterDigitOneOrMore() throws SRLSyntaxError {
        assertEquals("/^(?:[a-z][0-9])+/", Util.toRegex("begin with (letter,digit) once or more"));
    }

    /**
     * Test method begin with one or more letter and one or more digit
     *
     * Example: a1,b5h7
     *
     */
    public void testBeginWithOneOrMoreLetterAndOneOrMoreDigit() throws SRLSyntaxError {
        assertEquals("/^(?:[a-z]|[0-9])+/", Util.toRegex("begin with any of(letter,digit) once or more"));
    }


}
