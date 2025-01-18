import java.time.LocalDate;

public class TrafficLight extends StreetFurniture{
    private LocalDate lastRevised;

    public TrafficLight(String ID, GPSPosition gpsPosition, LocalDate lastRevised) {
        super(ID, gpsPosition);
        this.lastRevised = lastRevised;
    }

    public LocalDate getLastRevised(){
        return lastRevised;
    }

    public void setLastRevised(LocalDate lastRevised){
        if(lastRevised.isBefore(this.lastRevised)){
            throw new IllegalArgumentException("last Revised Date cannot be before current last revised date");
        }
        this.lastRevised = lastRevised;
    }

    @Override
    public String toString(){
        return "TrafficLight{id='"+ super.ID + "', position=" + super.gpsPosition +  ", lastRevised= " + this.lastRevised +"}";
    }
}
