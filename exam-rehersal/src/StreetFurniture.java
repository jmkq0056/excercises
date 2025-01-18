import java.util.HashSet;
import java.util.Set;

public class StreetFurniture {
    protected final String ID;
    GPSPosition gpsPosition;
    private static final Set<String> usedIDs = new HashSet<>();

    public StreetFurniture(String ID, GPSPosition gpsPosition) {
        if (usedIDs.contains(ID)) {
            throw new IllegalArgumentException("ID '" + ID + "' is already in use.");
        }
        this.ID = ID;
        this.gpsPosition = gpsPosition;
        usedIDs.add(ID);
    }

    public void setPosition(GPSPosition gpsPosition) {
        this.gpsPosition = gpsPosition;
    }

    public GPSPosition getPosition() {
        return gpsPosition;
    }

    @Override
    public String toString() {
        return "StreetFurniture{id='" + ID + "', position=" + gpsPosition + "}";
    }

    public static void clearUsedIDs() {
        usedIDs.clear();
    }
}
