import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CityMap cityMap = new CityMap();
// Add street furniture
        GPSPosition pos1 = new GPSPosition(12.34, 56.78);
        StreetFurniture playground = new PlayGround("PG123", pos1, 30);
        cityMap.addStreetFurniture(playground);
        GPSPosition pos2 = new GPSPosition(90.12, 34.56);
        StreetFurniture trafficLight = new TrafficLight("TL456", pos2, LocalDate.of(2024, 1, 15));
        cityMap.addStreetFurniture(trafficLight);
// Get street furniture by position
        StreetFurniture foundFurniture = cityMap.getStreetFurniture(pos1);
        System.out.println(foundFurniture);
// Output: PlayGround{id='PG123', position=GPSPosition{x=12.34, y=56.78}, maxCapacity=30}
// Remove street furniture
        cityMap.removeStreetFurniture(playground);
        System.out.println(cityMap.getStreetFurniture(pos1));
// Output: null



    }
}