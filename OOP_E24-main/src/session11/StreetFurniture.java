package session11;

public class StreetFurniture {

    protected String stringID;
    private GPSPosition position;

    public StreetFurniture(String stringID, GPSPosition position) {
        //if (stringID==null)
        //    throw new IllegalArgumentException("Your are providing a null value for the StringID");
        assert stringID!=null;

        this.stringID = stringID;
        this.position = position;
    }

    public String getStringID() {
        return stringID;
    }

    public GPSPosition getPosition() {
        return position;
    }

    public void setPosition(GPSPosition gPSPosition) {
        this.position = gPSPosition;
    }

    @Override
    public String toString() {
        return "StreetFurniture{" +
                "stringID='" + stringID + '\'' +
                ", position=" + position +
                '}';
    }


}
