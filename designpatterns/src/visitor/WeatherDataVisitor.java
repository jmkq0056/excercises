package visitor;

/**
 * Visitor interface for performing operations on WeatherData.
 * This defines the "visit" method for processing WeatherData elements.
 */
public interface WeatherDataVisitor {
    void visit(WeatherData data);
}
