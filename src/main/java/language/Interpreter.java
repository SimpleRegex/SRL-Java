package language;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by samuelt on 31/08/2016.
 */
public class Interpreter {

    protected String rawQuery;
    protected String[] resolvedQuery = {};
    protected Matcher matcher;
    protected Builder builder;

    public Interpreter(String query) {
        // Trim query and remove all ';' at the end of the string
        this.rawQuery = query.trim().replaceAll(";+$", "");
        this.matcher = Matcher.INSTANCE;
        if(Cache.has(this.rawQuery)) this.builder = Cache.get(this.rawQuery);
        else build();
    }

    public void build() {
        resolve();
        this.builder = buildQuery(this.resolvedQuery);
        Cache.add(this.rawQuery, this.builder);
    }

    protected void resolve() {
        this.resolvedQuery = resolveQuery(new ParenthesesParser(this.rawQuery).parse());
    }

    protected List<Object> resolveQuery(List<Object> query) {
        for(int i = 0; i < query.size(); i++) {
            Object elem = query.get(i);
            if(elem instanceof String) {
                String elemStr = ((String) elem);
                elemStr =  elemStr.replace(",", "");
                query.set(i, elemStr);
                if(elemStr.isEmpty()){
                    query.remove(i);
                    continue;
                }
                try {
                    Method method = matcher.match(elemStr);
                    String leftOver = elemStr.replace(method.getOriginal(), "");
                    query.set(i, method);
                    if(!leftOver.isEmpty()) query.add(i + 1, leftOver.trim());
                } catch (SyntaxException e) {
                    String[] split = ((String) query.get(i)).split("[\\s]+", 2);
                    query.set(i, split[0]);
                    if(split.length > 1) query.add(i + 1, split[1].trim());
                }
            } else if(elem instanceof List) query.set(i, resolveQuery(((List) elem)));
            else if(!(elem instanceof Literally)) throw new InterpreterException("Unexpected statement: " + elem);
        }
        return query;
    }

    public static Builder buildQuery(List query) {
        return buildQuery(query, null);
    }

    public static Builder buildQuery(List query, Builder builder) {
        if(builder == null) builder = new Builder();
        for(int i = 0; i < query.size(); i++) {
            Object method = query.get(i);
            if(method instanceof List) {
                builder.and(buildQuery(method, new NonCapture()));
                continue;
            }
            if(!(method instanceof Method)) throw new SyntaxException("Unexpected statement: " + method);
            List parameters = new LinkedList();
            while (i + 1 <= query.size() && query.get(i + 1) != null && !(query.get(i + 1) instanceof Method)) {
                parameters.add(query.get(i + 1));
                for(int c = i + 1; c > 0; c --) query.remove(c);
            }
            try {
                method.setParameters(parameters).callMethodOn(builder);
            } catch (SyntaxException e) {
                if(parameters.size() > 0 && parameters.get(0) instanceof List) {
                    method.callMethodOn(builder);
                    builder.and(buildQuery(parameters.get(0), new NonCapture))
                }else throw new SyntaxException("Invalid parameter given for " + method.getOriginal() + ".", 0, e);
            }
        }
    }

    public String get() {
        return get('/', false);
    }

    private String get(char delimiter, boolean ignoreInvalid) {
        return this.builder.get(delimiter, ignoreInvalid)
    }

    public Builder getBuilder() {
        return this.builder;
    }

    public String getRawQuery() {
        return this.rawQuery;
    }

}
