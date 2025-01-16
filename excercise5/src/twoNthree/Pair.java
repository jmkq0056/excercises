package twoNthree;
//IMMUTABLE
public class Pair<A, B> {
    private final A first; // First value of the pair
    private final B second; // Second value of the pair

    // Constructor to initialize the pair
    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public Pair<B,A> swap() {
        return new Pair<B,A>(second,first);
    }

    // Getter for the first value
    public A getFirst() {
        return first;
    }

    // Getter for the second value
    public B getSecond() {
        return second;
    }
}
