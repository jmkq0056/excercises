package strategy;

/**
 * Strategy for converting temperatures to Celsius.
 */
public class CelsiusConversion implements TemperatureConversionStrategy {
    @Override
    public double convert(double temperature) {
        return temperature; // Already in Celsius
    }
}
