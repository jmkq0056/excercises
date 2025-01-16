package seven;
public class PizzaTruck implements Vehicle, ItalianKitchen {
    private String maker;
    private String model;
    private int year;
    private int numberOfWheels;

    // Constructor
    public PizzaTruck(String maker, String model, int year, int numberOfWheels) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.numberOfWheels = numberOfWheels;
    }

    // Implement Vehicle interface methods
    @Override
    public String getMaker() {
        return maker;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // Implement ItalianKitchen interface methods
    @Override
    public String makeMargheritaPizza() {
        return "Margherita Pizza is ready!";
    }

    @Override
    public String makePepperoniPizza() {
        return "Pepperoni Pizza is ready!";
    }

    @Override
    public String makeVegetarianPizza() {
        return "Vegetarian Pizza is ready!";
    }

    // Additional method for displaying truck details
    public String getTruckDetails() {
        return "Truck Details - Maker: " + maker + ", Model: " + model + ", Year: " + year + ", Wheels: " + numberOfWheels;
    }
}
