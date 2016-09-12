import com.github.simpleregex.SRLCompiler;
import com.github.simpleregex.error.SRLSyntaxError;

public class Util {
    public static String toRegex(String srlQuery) throws SRLSyntaxError {
        SRLCompiler compiler = new SRLCompiler(srlQuery);
        compiler.parse();
        return compiler.generate();
    }
}
