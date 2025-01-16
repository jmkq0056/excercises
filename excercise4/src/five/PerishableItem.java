package five;

import java.time.LocalDate;

public class PerishableItem implements Perishable {
    private String name;
    private int quantity;
    private LocalDate expirationDate;

    public PerishableItem(String name, int quantity, LocalDate expirationDate) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
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
        return "Perishable";
    }

    @Override
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
