import java.util.HashSet;
import java.util.Set;

public class TrafficDepartment implements Listener{
    private final Set<TrafficLight> trafficLights;
    public TrafficDepartment () {
        trafficLights = new HashSet<>();
    }

    public void addTrafficLight(TrafficLight trafficLight){
        assert trafficLight != null;
        trafficLights.add(trafficLight);
    }

    public Set<TrafficLight> getTrafficLights(){
        return  trafficLights;
    }

    @Override
    public void update(StreetFurniture streetFurniture){
        if(streetFurniture instanceof TrafficLight){
            this.addTrafficLight((TrafficLight) streetFurniture);
        }
    }
}
