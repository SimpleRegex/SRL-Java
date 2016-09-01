package main.java.language.methods;


import java.util.Arrays;
import java.util.List;
import main.java.exceptions.SyntaxException;
import main.java.interfaces.Method;

/**
 * Created by marco on 31/08/16.
 */
public class AndMethod extends Method {

    public AndMethod(String original, String methodName) {
        super(original, methodName);
    }

    @Override
    public Method setParameters(List<Object> params) throws SyntaxException
    {

        params=Arrays.asList(Arrays.stream(params.toArray()).filter(item -> {
            if(!(item instanceof String)){
                return true;
            }
            String lower=((String)item).toLowerCase();
            return !lower.equals("and") && !lower.equals("times") && !lower.equals("time");
        }).toArray(Object[]::new));


        return super.setParameters(params);
    }
}
