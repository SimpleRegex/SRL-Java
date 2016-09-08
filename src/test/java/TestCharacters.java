import com.github.simpleregex.error.SRLSyntaxError;
import junit.framework.TestCase;

/**
 * Created by samuelt on 08/09/2016.
 */
public class TestCharacters extends TestCase {

    public void testLetter() throws SRLSyntaxError {
        assertEquals(TestUtil.toRegex("letter"), "/[a-z]/");
    }

    public void testLiterally() throws SRLSyntaxError {
        assertEquals(TestUtil.toRegex("literally \"a\""), "/a/");
    }

    public void testOneOf() throws SRLSyntaxError {
        assertEquals(TestUtil.toRegex("one of \"abc\""), "/[abc]/");
    }
    
}
