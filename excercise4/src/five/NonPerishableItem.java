package five;

public class NonPerishableItem implements NonPerishable {
    private String name;
    private int quantity;
    private String bestBefore;

    public NonPerishableItem(String name, int quantity, String bestBefore) {
        this.name = name;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getCategory() {
        return "Non-Perishable";
    }

    @Override
    public String getBestBefore() {
        return bestBefore;
    }
}
