import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by samuelt on 31/08/2016.
 */
public class Match {

    protected LinkedHashMap<Object, Object> rawData = new LinkedHashMap<>();
    protected LinkedHashMap<String, Object> attributes = new LinkedHashMap<>();

    public Match(LinkedHashMap<Object, Object> data) {
        this.rawData = data;
        rawData.entrySet().stream().filter(entry -> entry.getKey() instanceof String).forEach(entry -> attributes.put(entry.getKey().toString(), entry.getValue()));
        if(attributes.isEmpty()) {
            LinkedHashMap<Object, Object> copy = data.remove(data.ke)
        }
    }

}
