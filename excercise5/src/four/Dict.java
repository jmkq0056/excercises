package four;
import com.sun.jdi.Value;
import twoNthree.Pair;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class Dict<K, V> {
    private final List<Pair<K, V>> entries;

    public Dict() {
        this.entries = new ArrayList<>();
    }

    public V get (K key){
        for(Pair<K,V> entry : entries){
            if(entry.getFirst().equals(key)){
                return entry.getSecond();
            }
        }
        return null;
    }

    public void put(K key, V value){
        for(int i = 0; i < entries.size(); i++){
            Pair<K,V> entry = entries.get(i);
            if(entry.getFirst().equals(key)){
                entries.set(i, new Pair<>(key, value));
            }
        }
        entries.add(new Pair<>(key, value));
    }

}
