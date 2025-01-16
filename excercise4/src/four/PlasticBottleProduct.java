package four;

public class PlasticBottleProduct extends Product {
    private int milliliters;

    public PlasticBottleProduct(String name, double price, int quantity, int slot, int milliliters) {
        super(name, price, quantity, slot);
        this.milliliters = milliliters;
    }

    public int getNumberOfMilliliters() {
        return milliliters;
    }
}
