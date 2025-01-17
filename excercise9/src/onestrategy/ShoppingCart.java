package onestrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products; // List to hold products in the cart
    private PaymentMethod paymentMethod; // Selected payment strategy

    public ShoppingCart() {
        this.products = new ArrayList<>(); // Initialize an empty list of products
    }

    public void addProduct(Product product) {
        products.add(product); // Add a product to the list
        System.out.println(product.getName() + " added to the cart. Price: " + product.getPrice());
    }

    public double getTotalAmount() {
        // Calculate the total price of all products in the cart
        // Stream processes the list of products:
        // - mapToDouble(Product::getPrice) extracts the price of each product as a double
        // - sum() calculates the total price from all extracted prices
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod; // Set the payment strategy dynamically
    }

    public void checkout() {
        if (paymentMethod == null) {
            throw new IllegalStateException("Payment method not set."); // Ensure payment method is set
        }
        double total = getTotalAmount(); // Get the total price of products in the cart
        boolean paymentSuccess = paymentMethod.pay(total); // Use the selected payment strategy to pay
        if (paymentSuccess) {
            System.out.println("Payment successful. Total amount: " + total);
        }
    }
}
