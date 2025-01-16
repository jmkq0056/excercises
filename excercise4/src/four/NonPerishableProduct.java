package four;

import java.time.LocalDate;

public class NonPerishableProduct extends Product {
    private LocalDate bestBeforeDate;

    public NonPerishableProduct(String name, double price, int quantity, int slot, LocalDate bestBeforeDate) {
        super(name, price, quantity, slot);
        this.bestBeforeDate = bestBeforeDate;
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }
}
