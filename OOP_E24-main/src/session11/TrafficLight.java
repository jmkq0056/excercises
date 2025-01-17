package session11;

import java.time.LocalDate;

public class TrafficLight extends StreetFurniture{
    private LocalDate lastRevised;

    public TrafficLight(String stringID, GPSPosition position, LocalDate lastRevised) {
        super(stringID, position);
        this.lastRevised = lastRevised;
    }

    public LocalDate getLastRevised() {
        return lastRevised;
    }

    public void setLastRevised(LocalDate lastRevised) {
        assert lastRevised!=null;
        this.lastRevised = lastRevised;
    }

    @Override
    public String toString() {
        String stringLocal =  "TrafficLight{" +
                "lastRevised=" + lastRevised +
                '}';

        String stringSuper = super.toString();

        return stringSuper+" "+ stringLocal;

    }
}
