package session11;

import java.util.HashSet;
import java.util.Set;

public class TrafficDepartment  implements Listener{

    private Set<TrafficLight> trafficLightSet;

    public TrafficDepartment() {
        trafficLightSet = new HashSet<>();
    }

    public void addTrafficLight(TrafficLight trafficLight){
        this.trafficLightSet.add(trafficLight);
    }

    public Set<TrafficLight> getTrafficLights(){
        return this.trafficLightSet;
    }

    @Override
    public void update(StreetFurniture furniture) {
        //
        if (furniture instanceof TrafficLight)
            this.addTrafficLight((TrafficLight) furniture);
    }
}
