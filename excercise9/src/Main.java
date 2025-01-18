import onestrategy.*;
import twoobserver.*;
import threedecorator.*;

public class Main {
    public static void main(String[] args) {
        // problem one strategy
/*
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct(new Product("Laptop", 1200.0));
        cart.addProduct(new Product("Headphones", 150.0));
        cart.addProduct(new Product("Mouse", 50.0));

        // Total amount
        System.out.println("Total amount: " + cart.getTotalAmount());

        try {
            // Payment by MasterCard
            cart.setPaymentMethod(new PaymentByMasterCard("1234567890123456"));
            cart.checkout();

            // Payment by PayPal
            cart.setPaymentMethod(new PaymentByPaypal("user@example.com"));
            cart.checkout();
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
*/
        // problem 2 observer pattern

        // Create a NewsFeed
        NewsFeed newsFeed = new NewsFeed();

        // Create Subscribers
        Subscriber emailSubscriber1 = new EmailSubscriber("user1@example.com");
        Subscriber emailSubscriber2 = new EmailSubscriber("user2@example.com");
        Subscriber appSubscriber1 = new AppSubscriber(101);
        Subscriber appSubscriber2 = new AppSubscriber(102);

        // Add Subscribers to NewsFeed
        newsFeed.addSubscriber(emailSubscriber1);
        newsFeed.addSubscriber(emailSubscriber2);
        newsFeed.addSubscriber(appSubscriber1);
        newsFeed.addSubscriber(appSubscriber2);

        // Notify Subscribers
        System.out.println("Publishing news: 'Big Sale on Electronics!'");
        newsFeed.notifySubscribers("Big Sale on Electronics!");

        // Remove a Subscriber and notify again
        newsFeed.removeSubscriber(emailSubscriber1);
        System.out.println("\nPublishing news: 'New Smartphone Released!'");
        newsFeed.notifySubscribers("New Smartphone Released!");

        // problem 3 decorator pattern
/*
        // Create a basic SendDataService instance
        SendDataService basicService = new SendDataServiceBasic("http://example.com");

        // Wrap it with an EncryptorDecorator
        SendDataService encryptedService = new EncryptorDecorator(basicService);

        // Wrap the encrypted service with a CompressorDecorator
        SendDataService compressedEncryptedService = new CompressorDecorator(encryptedService);

        // Send data with both encryption and compression
        compressedEncryptedService.sendData("Hello, World!");
*/
    }
}
