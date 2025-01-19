import observer.*;
import strategy.*;
import visitor.*;

/**
 * Demonstrates the use of Observer, Strategy, and Visitor design patterns.
 */
public class Main {
    public static void main(String[] args) {
        // -----------------------------------------------------
        // Observer Pattern: Dynamically notify observers of changes
        // -----------------------------------------------------
        // The WeatherStation acts as the subject, managing a list of observers.
        // WeatherDisplay instances are observers that get notified when the
        // weather data changes.

        WeatherStation station = new WeatherStation();
        WeatherDisplay display1 = new WeatherDisplay("Display1"); // Observer 1
        WeatherDisplay display2 = new WeatherDisplay("Display2"); // Observer 2

        station.addObserver(display1); // Register display1 as an observer
        station.addObserver(display2); // Register display2 as an observer

        // Simulate weather data updates. All registered observers get notified.
        station.setWeatherData("Sunny, 25°C");
        station.setWeatherData("Cloudy, 22°C");

        System.out.println(); // Separator for output clarity

        // -----------------------------------------------------
        // Strategy Pattern: Dynamically switch between algorithms
        // -----------------------------------------------------
        // The Strategy pattern is used to switch between different temperature
        // conversion algorithms (e.g., Celsius to Fahrenheit).

        TemperatureConversionStrategy celsiusStrategy = new CelsiusConversion(); // Conversion to Celsius
        TemperatureConversionStrategy fahrenheitStrategy = new FahrenheitConversion(); // Conversion to Fahrenheit

        double tempCelsius = 25.0; // Example temperature in Celsius

        // Use the strategies dynamically to perform conversion
        System.out.println("Temperature in Celsius: " + celsiusStrategy.convert(tempCelsius)); // Output: 25.0
        System.out.println("Temperature in Fahrenheit: " + fahrenheitStrategy.convert(tempCelsius)); // Output: 77.0

        System.out.println(); // Separator for output clarity

        // -----------------------------------------------------
        // Visitor Pattern: Perform operations on weather data
        // -----------------------------------------------------
        // The Visitor pattern allows us to perform multiple operations
        // (e.g., printing details or calculating averages) on the same
        // WeatherData structure without modifying the class itself.

        WeatherData data1 = new WeatherData(25, 60); // Weather data with temperature and humidity
        WeatherData data2 = new WeatherData(22, 65);
        WeatherData data3 = new WeatherData(30, 50);

        // Create visitors for specific operations
        PrintWeatherDetailsVisitor printVisitor = new PrintWeatherDetailsVisitor(); // Prints details
        AverageWeatherDataVisitor averageVisitor = new AverageWeatherDataVisitor(); // Calculates averages

        // Use the printVisitor to display weather details
        data1.accept(printVisitor); // Visitor processes data1
        data2.accept(printVisitor); // Visitor processes data2
        data3.accept(printVisitor); // Visitor processes data3

        // Use the averageVisitor to calculate averages
        data1.accept(averageVisitor); // Visitor processes data1
        data2.accept(averageVisitor); // Visitor processes data2
        data3.accept(averageVisitor); // Visitor processes data3

        // Print the calculated averages
        averageVisitor.printAverages(); // Outputs average temperature and humidity
    }
}
