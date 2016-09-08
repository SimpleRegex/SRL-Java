import com.github.simpleregex.SRLCompiler;
import junit.framework.TestCase;

/**
 * Created by marco on 07/09/16.
 */
public class TestBeginWith extends TestCase {


    /**
     * Test method begin with that accept one digit
     */
    public void testBeginWithDigit(){
        SRLCompiler compiler = new SRLCompiler("begin with digit");
        compiler.parse();
        assertEquals("/^[0-9]/",compiler.generate());
    }

    /**
     * Test method begin with that accept one character
     * Example: a,b,c
     */
    public void testBeginWithLetter(){
        SRLCompiler compiler = new SRLCompiler("begin with letter");
        compiler.parse();
        assertEquals("/^[a-z]/",compiler.generate());
    }

    /**
     * Test method begin with one letter or one digit
     * Example: 1b
     */
    public void testBeginWithOneLetterOrOneDigit(){
        SRLCompiler compiler = new SRLCompiler("begin with (letter,digit)");
        compiler.parse();
        assertEquals("/^(?:[a-z][0-9])/",compiler.generate());
    }

    /**
     * Test method begin with letter and digit one or more
     *
     * Example: a1,b5h7
     *
     */
    public void testBeginWithLetterDigitOneOrMore(){
        SRLCompiler compiler = new SRLCompiler("begin with (letter,digit) once or more");
        compiler.parse();
        assertEquals("/^(?:[a-z][0-9])+/",compiler.generate());
    }

    /**
     * Test method begin with one or more letter and one or more digit
     *
     * Example: a1,b5h7
     *
     */
    public void testBeginWithOneOrMoreLetterAndOneOrMoreDigit(){
        SRLCompiler compiler = new SRLCompiler("begin with any of(letter,digit) once or more");
        compiler.parse();
        assertEquals("/^(?:[a-z]|[0-9])+/",compiler.generate());
    }


}
