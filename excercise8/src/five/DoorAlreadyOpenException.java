package five;

public class DoorAlreadyOpenException extends RuntimeException {
    public DoorAlreadyOpenException(String message) {
        super(message);
    }
}
