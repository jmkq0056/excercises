package session11;

public class PlayGround extends StreetFurniture{
    //
    final private int maxCapacity;

    public PlayGround(String stringID, GPSPosition gpsPosition, int maxCapacity){
        super(stringID,gpsPosition);
        assert maxCapacity>0;
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Andrés!! This contradicat the previvous requireqments.
     * @param newStringID
     */
    public void setStringID(String newStringID){
        super.stringID = newStringID;
    }


}
