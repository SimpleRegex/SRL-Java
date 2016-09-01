package main.java.language.helpers;


import java.util.HashMap;
import java.util.Map;
import main.java.Builder;

/**
 * Created by marco on 31/08/16.
 */
public class Cache {
    /** @var Builder[] */
    protected static Map<String,Builder> cache = new HashMap<>();

    /**
     * Add Builder for SRL to cache.
     *
     * @param srl
     * @param builder
     */
    public static void add(String srl, Builder builder)
    {
        cache.put(srl,builder);
    }

    /**
     * Validate if current SRL is already in cache.
     *
     * @param srl
     * @return
     */
    public static boolean has(String srl)
    {
        return cache.containsKey(srl);
    }

    /**
     * Get SRL from cache, or return new Builder.
     * @param srl
     * @return
     */
    public static Builder get(String srl)
    {
        return cache.containsKey(srl)?cache.get(srl):new Builder();
    }
}
