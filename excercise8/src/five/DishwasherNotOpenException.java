package five;

public class DishwasherNotOpenException extends RuntimeException {
    public DishwasherNotOpenException(String message) {
        super(message);
    }
}
