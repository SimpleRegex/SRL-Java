import com.github.simpleregex.error.SRLSyntaxError;
import junit.framework.TestCase;

/**
 * Created by samuelt on 08/09/2016.
 */
public class TestMisc extends TestCase {

    public void testCaseInsensitivity() throws SRLSyntaxError {
        assertEquals(TestUtil.toRegex("letter"), TestUtil.toRegex("LeTtEr"));
    }

    public void testCommaSeparation() throws SRLSyntaxError {
        assertEquals(TestUtil.toRegex("letter, letter"), TestUtil.toRegex("letter letter"));
    }

}
