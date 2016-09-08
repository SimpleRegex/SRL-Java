import com.github.simpleregex.SRL;
import com.github.simpleregex.error.SRLSyntaxError;
import junit.framework.TestCase;

/**
 * Created by marco on 08/09/16.
 */
public class TestSrl extends TestCase {

    /**
     * Test a regular expression for email
     */
    public void testEmailAddress() throws SRLSyntaxError {
        SRL srl=new SRL("begin with any of (digit, letter, one of \"._%+-\") once or more,\n" +
                "literally \"@\",\n" +
                "any of (digit, letter, one of \".-\") once or more,\n" +
                "literally \".\",\n" +
                "letter at least 2,\n" +
                "must end, case insensitive");
        assertTrue(srl.isMatching("marco@libero.it"));
        assertTrue(srl.isMatching("_.sasdsdasd@sdsdasdsd.it"));
        assertFalse(srl.isMatching("_.sasdsdasdsdsdasdsd.it"));
        assertFalse(srl.isMatching("_.sasdsdasdsdsdasdsd.it"));
        assertFalse(srl.isMatching("_.sasdsdasdsd@sdasdsdit"));

    }
}
