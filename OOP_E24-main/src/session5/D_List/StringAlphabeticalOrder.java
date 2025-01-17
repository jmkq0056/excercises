package session5.D_List;

import java.util.Comparator;

public class StringAlphabeticalOrder implements Comparator<String> {

    /**
     * Compares its two arguments for order.
     * Returns a negative integer, zero, or a positive integer
     * as the first argument is less than, equal to, or greater * than the second.
     */
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
