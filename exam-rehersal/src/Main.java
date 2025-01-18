import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Exercise 1: Test GPSPosition and StreetFurniture classes
        GPSPosition pos1 = new GPSPosition(55.676098, 12.568337);
        GPSPosition pos2 = new GPSPosition(55.676098, 12.568337);
        GPSPosition pos3 = new GPSPosition(55.676100, 12.568340);

        // Test GPSPosition equals and hashCode
        System.out.println("Exercise 1a:");
        System.out.println("pos1.equals(pos2): " + pos1.equals(pos2)); // true
        System.out.println("pos1.equals(pos3): " + pos1.equals(pos3)); // false

        // Test StreetFurniture class
        StreetFurniture bench = new StreetFurniture("SF001", pos1);
        System.out.println("Exercise 1b:");
        System.out.println(bench);
        bench.setPosition(pos3);
        System.out.println(bench);

        // Exercise 2: Test PlayGround and TrafficLight classes
        PlayGround playground = new PlayGround("PG123", new GPSPosition(12.34, 56.78), 30);
        TrafficLight trafficLight = new TrafficLight("TL456", new GPSPosition(90.12, 34.56), LocalDate.of(2024, 1, 15));

        System.out.println("Exercise 2:");
        System.out.println(playground);
        System.out.println(trafficLight);

        // Exercise 3: Test CityMap functionality
        CityMap cityMap = new CityMap();

        cityMap.addStreetFurniture(playground);
        cityMap.addStreetFurniture(trafficLight);

        System.out.println("Exercise 3:");
        System.out.println("CityMap contents:");
        System.out.println(cityMap);

        System.out.println("Get street furniture at position (12.34, 56.78):");
        System.out.println(cityMap.getStreetFurniture(new GPSPosition(12.34, 56.78)));

        cityMap.removeStreetFurniture(playground);
        System.out.println("CityMap contents after removing playground:");
        System.out.println(cityMap);

        // Exercise 4: Test Observer Design Pattern
        TrafficDepartment trafficDepartment = new TrafficDepartment();
        cityMap.addListener(trafficDepartment);

        GPSPosition pos4 = new GPSPosition(78.90, 12.34);
        TrafficLight newTrafficLight = new TrafficLight("TL789", pos4, LocalDate.of(2025, 1, 1));

        cityMap.addStreetFurniture(newTrafficLight); // Should notify the TrafficDepartment

        System.out.println("Exercise 4:");
        System.out.println("TrafficDepartment traffic lights:");
        System.out.println(trafficDepartment.getTrafficLights());

        // Test PlaygroundDepartment Observer
        PlayGroundDepartment playGroundDepartment = new PlayGroundDepartment();
        cityMap.addListener(playGroundDepartment);

        GPSPosition pos5 = new GPSPosition(67.89, 45.67);
        PlayGround newPlayground = new PlayGround("PG456", pos5, 50);

        cityMap.addStreetFurniture(newPlayground); // Should notify the PlaygroundDepartment


        // EXTRA CODE JUST TO SEE NOT PART OF EXAM
        System.out.println("PlaygroundDepartment playgrounds:");
        System.out.println(playGroundDepartment.getPlayGrounds());
    }
}
