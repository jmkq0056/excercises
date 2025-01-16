import four.VendingMachine;
import four.PerishableProduct;
import four.NonPerishableProduct;
import four.PlasticBottleProduct;
import java.time.LocalDate;
import five.SmartFridge;
import five.PerishableItem;
import five.NonPerishableItem;
public class Main {
    public static void main(String[] args) {
        // problem 1
/*
        // Create a vending machine instance
        VendingMachine vendingMachine = new VendingMachine();

        // Add products to the vending machine
        vendingMachine.addProduct(new PerishableProduct("Milk", 2.5, 10, 1, LocalDate.now().plusDays(7)));
        vendingMachine.addProduct(new NonPerishableProduct("Chips", 1.5, 20, 2, LocalDate.now().plusMonths(6)));
        vendingMachine.addProduct(new PlasticBottleProduct("Soda", 1.2, 15, 3, 500));

        // Display products
        System.out.println("Available products in the vending machine:");
        vendingMachine.displayProducts();

        // Attempt to purchase some products
        System.out.println("\nPurchasing products:");
        vendingMachine.purchaseProduct(1); // Buy Milk
        vendingMachine.purchaseProduct(2); // Buy Chips
        vendingMachine.purchaseProduct(3); // Buy Soda

        // Display products after purchases
        System.out.println("\nProducts remaining in the vending machine:");
        vendingMachine.displayProducts();

        // Attempt to purchase a product from an empty slot
        System.out.println("\nAttempting to purchase from an empty slot:");
        vendingMachine.purchaseProduct(4); // Slot 4 is empty
*/
        // problem 2
        // Create a smart fridge
        SmartFridge fridge = new SmartFridge();

        // Add items to the fridge
        fridge.addItem(new PerishableItem("Milk", 2, LocalDate.now().plusDays(2))); // Expires soon
        fridge.addItem(new PerishableItem("Cheese", 1, LocalDate.now().plusDays(10)));
        fridge.addItem(new NonPerishableItem("Canned Beans", 3, "Best before opening"));
        fridge.addItem(new NonPerishableItem("Bottle of Water", 5, "No expiration"));

        // Display all items in the fridge
        fridge.displayItems();

        // Display items nearing expiration
        System.out.println("\nChecking for expiring items...");
        fridge.displayExpiringItems();

        // Remove an item and display updated inventory
        System.out.println("\nRemoving 'Milk'...");
        fridge.removeItem("Milk");
        fridge.displayItems();

    }

}
