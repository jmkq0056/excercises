package four;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<Integer, Product> slots; // Stores products by their unique slot number

    public VendingMachine() {
        slots = new HashMap<>(); // Initialize the storage for products
    }

    // Adds a product to a specific slot in the vending machine
    public void addProduct(Product product) {
        if (slots.containsKey(product.getSlot())) {
            // Prevent overwriting if the slot is already occupied
            System.out.println("Slot " + product.getSlot() + " is already occupied.");
        } else {
            slots.put(product.getSlot(), product); // Add product to the slot
        }
    }

    // Displays all products currently available in the vending machine
    public void displayProducts() {
        slots.forEach((slot, product) -> {
            System.out.println("Slot " + slot + ": " + product.getName() +
                    " (" + product.getQuantity() + " available) - $" + product.getPrice());
        });
    }

    // Attempts to purchase a product from a specified slot
    public boolean purchaseProduct(int slot) {
        Product product = slots.get(slot); // Retrieve the product from the slot
        if (product == null) {
            // Slot is empty
            System.out.println("Slot " + slot + " is empty.");
            return false;
        }
        if (product.isSoldOut()) {
            // Product is out of stock
            System.out.println(product.getName() + " is sold out.");
            return false;
        }
        // Decrease product quantity and confirm purchase
        product.setQuantity(product.getQuantity() - 1);
        System.out.println("Purchased: " + product.getName());
        return true;
    }
}
