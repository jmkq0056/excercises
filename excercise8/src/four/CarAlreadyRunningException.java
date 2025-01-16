package four;

public class CarAlreadyRunningException extends RuntimeException {
    public CarAlreadyRunningException(String message) {
        super(message);
    }
}
