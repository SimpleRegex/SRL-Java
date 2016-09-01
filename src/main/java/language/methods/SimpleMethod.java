package main.java.language.methods;

import main.java.exceptions.SyntaxException;
import main.java.interfaces.Method;

import java.util.List;

/**
 * Created by marco on 31/08/16.
 */
public class SimpleMethod extends Method {
    public SimpleMethod(String original, String methodName) {
        super(original, methodName);
    }
    public Method setParameters(List<Object> params) throws SyntaxException {
        if (params.size()!=0) {
            throw new SyntaxException("Invalid parameter.");
        }

        return this;
    }
}
