package main.java.language.methods;

import main.java.exceptions.SyntaxException;
import main.java.interfaces.Method;

import java.util.Arrays;
import java.util.List;

/**
 * Created by marco on 31/08/16.
 */
public class AsMethod extends Method {

    public AsMethod(String original, String methodName) {
        super(original, methodName);
    }

    public Method setParameters(List<Object> params) throws SyntaxException
    {
        params= Arrays.asList(Arrays.stream(params.toArray()).filter(item -> {
            if(!(item instanceof String)){
                return true;
            }
            String lower=((String)item).toLowerCase();
            return !lower.equals("'as'") ;
        }).toArray(Object[]::new));

        return super.setParameters(params);
    }
}
