package five;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SmartFridge {
    private List<FridgeItem> items;

    public SmartFridge() {
        items = new ArrayList<>();
    }

    // Add an item to the fridge
    public void addItem(FridgeItem item) {
        items.add(item);
    }

    // Remove an item by name
    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    // Display all items in the fridge
    public void displayItems() {
        System.out.println("Items in the fridge:");
        for (FridgeItem item : items) {
            System.out.println("- " + item.getName() + " (" + item.getQuantity() + " units, " + item.getCategory() + ")");
        }
    }

    // Display items nearing expiration
    public void displayExpiringItems() {
        System.out.println("Items nearing expiration:");
        for (FridgeItem item : items) {
            if (item instanceof Perishable) {
                Perishable perishable = (Perishable) item;
                if (perishable.getExpirationDate().isBefore(LocalDate.now().plusDays(3))) {
                    System.out.println("- " + perishable.getName() + " (Expires on: " + perishable.getExpirationDate() + ")");
                }
            }
        }
    }
}
