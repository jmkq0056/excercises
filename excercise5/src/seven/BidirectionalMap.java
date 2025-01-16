package seven;

import java.util.HashMap;
import java.util.Map;

public class BidirectionalMap<A, B> {
    private final Map<A, B> forwardMap; // Map for A -> B
    private final Map<B, A> backwardMap; // Map for B -> A

    // Constructor to initialize the internal maps
    public BidirectionalMap() {
        this.forwardMap = new HashMap<>();
        this.backwardMap = new HashMap<>();
    }

    /**
     * Returns the element that `a` is mapped to.
     * @param a the key in the forward direction
     * @return the value mapped to `a`, or null if no mapping exists
     */
    public B getForward(A a) {
        return forwardMap.get(a);
    }

    /**
     * Returns the element that `b` is mapped to.
     * @param b the key in the backward direction
     * @return the value mapped to `b`, or null if no mapping exists
     */
    public A getBackward(B b) {
        return backwardMap.get(b);
    }

    /**
     * Creates a mapping between `a` and `b`.
     * If any mappings already exist for `a` or `b`, they are removed.
     * @param a the key in the forward direction
     * @param b the key in the backward direction
     */
    public void put(A a, B b) {
        // Remove existing mappings for `a` and `b` if they exist
        if (forwardMap.containsKey(a)) {
            B oldB = forwardMap.remove(a); // Remove the forward mapping
            backwardMap.remove(oldB);     // Remove the corresponding backward mapping
        }

        if (backwardMap.containsKey(b)) {
            A oldA = backwardMap.remove(b); // Remove the backward mapping
            forwardMap.remove(oldA);        // Remove the corresponding forward mapping
        }

        // Add the new mappings
        forwardMap.put(a, b);
        backwardMap.put(b, a);
    }
}
