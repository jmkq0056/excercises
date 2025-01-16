package six;

public interface DoorPhone {
    void call(String apt) throws NoSuchFloorException, NoSuchAptException, IllegalAptException;
}
