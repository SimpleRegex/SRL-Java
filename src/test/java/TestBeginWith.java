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
     */
    public void testBeginWithLetter(){
        SRLCompiler compiler = new SRLCompiler("begin with letter");
        compiler.parse();
        assertEquals("/^[a-z]/",compiler.generate());
    }

    /**
     * Test method begin with that accept one of the character between quotes
     */
    public void testBeginWithSpecificCharacters(){
        SRLCompiler compiler = new SRLCompiler("begin with '._%+-'");
        compiler.parse();
        assertEquals("/^[._%+-]/",compiler.generate());
    }


}
