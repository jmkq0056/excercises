package six;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Multimap<K, V> {
    private final Map<K, Set<V>> map;

    // Constructor to initialize the internal map
    public Multimap() {
        this.map = new HashMap<>();
    }

    /**
     * Returns the set of values that the key `k` is mapped to.
     * If no mapping exists for `k`, returns an empty set.
     */
    public Set<V> get(K k) {
        return map.getOrDefault(k, new HashSet<>());
    }

    /**
     * Adds the value `v` to the set of values that the key `k` is mapped to.
     */
    public void put(K k, V v) {
        // Get the set of values for the key or create a new set if it doesn't exist
        map.computeIfAbsent(k, key -> new HashSet<>()).add(v);
    }

    /**
     * Returns the set of all values across all keys in the multimap.
     */
    public Set<V> values() {
        Set<V> allValues = new HashSet<>();
        for (Set<V> valueSet : map.values()) {
            allValues.addAll(valueSet); // Add all values from each set
        }
        return allValues;
    }
}
