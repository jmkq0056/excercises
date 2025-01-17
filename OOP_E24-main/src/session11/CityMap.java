package session11;

import java.util.*;

public class CityMap {
    //I'm using  ArrayList even though I konw if
    //
    private Map<GPSPosition, StreetFurniture> streetFurnitureCollection;

    private List<Listener> listeners;


    public CityMap() {
        this.streetFurnitureCollection = new HashMap<>();
        this.listeners = new ArrayList<>();
    }

    //In this implementation, I'm assuming any object implementing listener interface is properly
    //overwritting the equals method.
    public void addListener(Listener listener){
        assert listener!=null;
        this.listeners.add(listener);
    }

    //In this implementation, I'm assuming any object implementing listener interface is properly
    //overwritting the equals method.
    public void removeListener(Listener listener){
        assert listener!=null;
        this.listeners.remove(listener);
    }

    public List<Listener> getListeners(){
        return this.listeners;
    }


    public void addStreetFurniture(StreetFurniture furniture) {
        assert furniture!=null;
        if (this.streetFurnitureCollection.containsKey(furniture.getPosition())) {
            PositionConflictException exception = new PositionConflictException(furniture.getPosition());
            throw exception;
        }

        this.streetFurnitureCollection.put(furniture.getPosition(), furniture);

        for (Listener listener: this.listeners)
                listener.update(furniture);

    }

    public StreetFurniture getStreetFurniture(GPSPosition position){
        assert position!=null;
        return this.streetFurnitureCollection.get(position);
    }
}
