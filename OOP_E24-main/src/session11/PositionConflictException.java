package session11;

public class PositionConflictException extends RuntimeException {

    private final GPSPosition position;

    public PositionConflictException(GPSPosition position) {
        super();
        this.position = position;
    }

    @Override
    public String getMessage(){
        return "There is already an object.... " + this.position.toString();
    }

}
