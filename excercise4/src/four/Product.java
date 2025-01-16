package four;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;
    private int slot; // Unique slot in the vending machine

    public Product(String name, double price, int quantity, int slot) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.slot = slot;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSlot() {
        return slot;
    }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Check if the product is sold out
    public boolean isSoldOut() {
        return quantity <= 0;
    }
}
