import java.util.HashMap;
import java.util.Map;

public class CityMap {
    private Map<GPSPosition, StreetFurniture> streetFurnitureCollection;


    public CityMap(){
        streetFurnitureCollection = new HashMap<>();
    }

    public void addStreetFurniture(StreetFurniture furniture){
        assert furniture != null;
        if(streetFurnitureCollection.containsKey(furniture.getPosition())) {
            throw new PositionConflictException("Furniture already exist at that place");
        }
        streetFurnitureCollection.put(furniture.getPosition(), furniture);
    }

    public void removeStreetFurniture(StreetFurniture furniture){
        assert furniture != null;
        streetFurnitureCollection.remove(furniture.getPosition(), furniture);
    }

    public StreetFurniture getStreetFurniture(GPSPosition position){
        return streetFurnitureCollection.get(position);
    }
}
