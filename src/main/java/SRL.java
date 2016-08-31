import language.Interpreter;

/**
 * Created by samuelt on 31/08/2016.
 */
public class SRL {

    protected Interpreter language;

    public SRL(String query) {
        this.language = new Interpreter(query);
    }

    @Override
    public String toString() {
        return this.language.get();
    }
}
