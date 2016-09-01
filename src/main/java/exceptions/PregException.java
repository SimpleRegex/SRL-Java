package main.java.exceptions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marco on 31/08/16.
 */
public class PregException extends SRLException {

    public static final Map<String,String> EXCEPTION_MESSAGES = new HashMap<String, String>();
    static {
        EXCEPTION_MESSAGES.put("PREG_INTERNAL_ERROR","Internal PCRE error.");
        EXCEPTION_MESSAGES.put("PREG_BACKTRACK_LIMIT_ERROR","Backtrack limit exhausted.");
        EXCEPTION_MESSAGES.put("PREG_RECURSION_LIMIT_ERROR","Recursion limit exhausted.");
        EXCEPTION_MESSAGES.put("PREG_BAD_UTF8_ERROR","Malformed UTF-8 data.");
        EXCEPTION_MESSAGES.put("PREG_BAD_UTF8_OFFSET_ERROR","Offset did not correspond to the begin of a valid UTF-8 code point.");
        EXCEPTION_MESSAGES.put("PREG_JIT_STACKLIMIT_ERROR","PCRE function failed due to limited JIT stack space.");
    }


    public PregException(String code){
        super(EXCEPTION_MESSAGES.containsKey(code)?EXCEPTION_MESSAGES.get(code):"Unknown preg error.");
    }


}
