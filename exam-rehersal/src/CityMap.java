import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityMap {
    private Map<GPSPosition, StreetFurniture> streetFurnitureCollection;
    private List <Listener> listeners;

    public CityMap(){
        streetFurnitureCollection = new HashMap<>();
        listeners = new ArrayList<>();
    }

    public void addListener(Listener listener){
        assert listener != null;
        listeners.add(listener);

    }

    public void removeListener(Listener listener){
        assert listener != null;
        listeners.remove(listener);
    }

    public List<Listener> getListeners(){
        return listeners;
    }


    public void addStreetFurniture(StreetFurniture furniture){
        assert furniture != null;
        if(streetFurnitureCollection.containsKey(furniture.getPosition())) {
            throw new PositionConflictException("Furniture already exist at that place");
        }
        streetFurnitureCollection.put(furniture.getPosition(), furniture);

        List<Listener> allListeners = getListeners();
        for(Listener listener : allListeners){
            listener.update(furniture);
        }
    }

    public void removeStreetFurniture(StreetFurniture furniture){
        assert furniture != null;
        streetFurnitureCollection.remove(furniture.getPosition(), furniture);
    }

    public StreetFurniture getStreetFurniture(GPSPosition position){
        return streetFurnitureCollection.get(position);
    }

}
