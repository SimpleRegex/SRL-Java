import com.github.simpleregex.SRLCompiler;
import com.github.simpleregex.error.SRLSyntaxError;

/**
 * Created by samuelt on 08/09/2016.
 */
public class TestUtil {
    public static String toRegex(String srlQuery) throws SRLSyntaxError {
        SRLCompiler compiler = new SRLCompiler(srlQuery);
        compiler.parse();
        return compiler.generate();
    }
}
