import com.github.simpleregex.error.SRLSyntaxError;
import junit.framework.TestCase;

public class TestCharacters extends TestCase {

    public void testLetter() throws SRLSyntaxError {
        assertEquals(Util.toRegex("letter"), "/[a-z]/");
    }

    public void testLiterally() throws SRLSyntaxError {
        assertEquals(Util.toRegex("literally \"a\""), "/a/");
    }

    public void testOneOf() throws SRLSyntaxError {
        assertEquals(Util.toRegex("one of \"abc\""), "/[abc]/");
    }

    public void testUppercaseLetter() throws SRLSyntaxError {
        assertEquals(Util.toRegex("uppercase letter"), "/[A-Z]/");
    }

    public void testAnyCharacter() throws SRLSyntaxError {
        assertEquals(Util.toRegex("any character"), "/\\w/");
    }

    public void testDigit() throws SRLSyntaxError {
        assertEquals(Util.toRegex("digit"), "/[0-9]/");
    }

    public void testAnything() throws SRLSyntaxError {
        assertEquals(Util.toRegex("anything"), "/./");
    }

    public void testNewLine() throws SRLSyntaxError {
        assertEquals(Util.toRegex("new line"), "/\\n/");
    }

    public void testTab() throws SRLSyntaxError {
        assertEquals(Util.toRegex("tab"), "/\\t/");
    }

    public void testRaw() throws SRLSyntaxError {
        assertEquals(Util.toRegex("raw \"[a-zA-Z]\""), "/[a-zA-Z]/");
    }

}
