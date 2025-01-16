package five;

import java.util.HashMap;
import java.util.Map;

public class Multiset<E> {
    private final Map<E, Integer> elements;

    // Constructor to initialize the internal map
    public Multiset() {
        this.elements = new HashMap<>();
    }

    // Returns the count of an element in the multiset
    public int count(E e) {
        return elements.getOrDefault(e, 0);
    }

    // Adds an element to the multiset
    public void add(E e) {
        elements.put(e, elements.getOrDefault(e, 0) + 1);
    }

    // Removes an element from the multiset
    public void remove(E e) {
        if (elements.containsKey(e)) {
            int currentCount = elements.get(e);
            if (currentCount == 1) {
                elements.remove(e); // Remove the element completely if count reaches 0
            } else {
                elements.put(e, currentCount - 1);
            }
        }
    }

    // Returns the number of different elements in the multiset
    public int size() {
        return elements.size();
    }
}
