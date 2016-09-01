/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.interfaces;


import com.sun.istack.internal.logging.Logger;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Level;
import language.Interpreter;
import main.java.Builder;
import main.java.exceptions.SyntaxException;
import main.java.language.helpers.Literally;

/**
 * TODO check if this class is ok
 * Created by marco on 31/08/16.
 */
public class Method {
    /** @var string Contains the original method name (case-sensitive). */
    protected String original;

    /** @var string Contains the method name to execute. */
    protected String methodName;

    /** @var List Contains the parsed parameters to pass on execution. */
    protected List<Object> parameters;

    /** @var List Contains all executed callbacks for that method. Helps finding "lost" groups. */
    private List<Integer> executedCallbacks;

    public Method(String original,String methodName){
        this.methodName=methodName;
        this.original=original;
        this.parameters=new LinkedList<>();
        this.executedCallbacks=new LinkedList<>();

    }

    /**
     * Get original method name.
     *
     * @return string
     */
    public String getOriginal()
    {
        return original;
    }

    /**
     * Call method with parameters on given builder object.
     *
     *
     * @param builder
     * @return 
     */
    public Builder callMethodOn(Builder builder)
    {

        Builder response = null;
        try {
            response = (Builder)builder.getClass().getMethod(this.methodName).invoke(this,this.parameters);


            for (int i=0;i<this.parameters.size();i++) {
                if (this.parameters.get(i) instanceof Function && this.executedCallbacks.indexOf(i)>-1) {
                    // Callback wasn't executed, but expected to. Assuming parentheses without method, so let's "and" it.
                    builder.group(this.parameters.get(i));
                }
            }

        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            Logger.getLogger(Method.class).log(Level.SEVERE, e.toString());
        }

        return response;

    }

    /**
     * Set and parse raw parameters for method.
     *
     *
     * @param params
     * @return 
     * @throws main.java.exceptions.SyntaxException
     */
    public Method setParameters(List<Object> params) throws SyntaxException {
        this.parameters=new LinkedList<>();
        for(int i=0;i<params.size();i++){
            if(params.get(i) instanceof Literally){
                this.parameters.add(((Literally) params.get(i)).getString());
            }
            else if(params.get(i) instanceof List){
                final int finalI = i;
                Function<Builder,Builder> f=(Builder b)->{
                    this.executedCallbacks.add(finalI);
                    return Interpreter.buildQuery((List)params.get(finalI),b);
                };
                this.parameters.add(f);
            }
        }

        return this;
    }
}
