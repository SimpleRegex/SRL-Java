import com.github.simpleregex.SRLCompiler;
import junit.framework.TestCase;

/**
 * Created by marco on 08/09/16.
 */
public class TestAnyOf extends TestCase {


    /**
     * Test method any of  that accept one digit or one letter
     */
    public void testAnyOfDigitOrLetterSingleTime(){
        SRLCompiler compiler = new SRLCompiler("any of (digit,letter)");
        compiler.parse();
        assertEquals("/(?:[0-9]|[a-z])/",compiler.generate());
    }

    /**
     * Test method any of  that accept  digit or  letter multiple times
     */
    public void testAnyOfDigitOrLetterMultipleTimes(){
        SRLCompiler compiler = new SRLCompiler("any of (digit,letter) once or more");
        compiler.parse();
        assertEquals("/(?:[0-9]|[a-z])+/",compiler.generate());
    }
}
