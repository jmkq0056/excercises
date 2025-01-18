public class PlayGround extends StreetFurniture{

    private final int maxCapacity;
    public PlayGround(String ID, GPSPosition gpsPosition, int maxCapacity) {
        super(ID, gpsPosition);
        if(maxCapacity < 1){
            throw new IllegalArgumentException("Capacity cant be smaller than 1");
        }
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    @Override
    public String toString(){
        return "PlayGround{id='"+ super.ID + "', position=" + super.gpsPosition +  ", maxCapacity= " + this.maxCapacity +"}";
    }
}
