import decorator.*;
import observer.*;
import observer.EventListener;
import strategy.*;
import visitor.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // strategy pattern
/*
        PaymentContext paymentContext = new PaymentContext();
        User paypalUser = new User("Alice", "Smith", "alice@example.com", null);
        User cardUser = new User("Bob", "Johnson", null, "1234567890123456");
        User bothUser = new User("Khan", "Khan", "Khan@example.com", "1234567890123457");
        try{
            paymentContext.setPaymentStrategy(new CreditCardPayment(cardUser));
            paymentContext.pay(150);

            paymentContext.setPaymentStrategy(new PayPalPayment(paypalUser));
            paymentContext.pay(75);

            paymentContext.setPaymentStrategy(new PayPalPayment(bothUser));
            paymentContext.pay(100);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
*/
        // Oberserver Pattern

        NotificationService notificationService = new NotificationService();

        // Listeners
        EventListener emailListener = new EmailMsgListener("user@example.com");
        EventListener mobileListener = new MobileAppListener("JohnDoe");

        // Subscribe listeners to events
        notificationService.subscribe(Event.NEW_ITEM, emailListener);
        notificationService.subscribe(Event.NEW_ITEM, mobileListener);

        notificationService.subscribe(Event.SALE, mobileListener);
        notificationService.printMap();
        System.out.println("\n");
        // Notify NEW_ITEM event
        System.out.println("Triggering NEW_ITEM event:");
        notificationService.notifyListeners(Event.NEW_ITEM);

        // Notify SALE event
        System.out.println("\nTriggering SALE event:");
        notificationService.notifyListeners(Event.SALE);

        // Unsubscribe a listener and trigger again
        notificationService.unsubscribe(Event.NEW_ITEM, mobileListener);
        System.out.println("\n");
        notificationService.printMap();
        System.out.println("\n");
        System.out.println("Triggering NEW_ITEM event after unsubscribing MobileAppListener:");
        notificationService.notifyListeners(Event.NEW_ITEM);

        // Decorator pattern [optional]
/*
        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Jawa0056")));
        notifyAll.send("The Easiest Way");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Jawa0057"));
        notifyFbMail.send("The Easiest Way");
*/
        // Visitor pattern
/*
        List<Client> clients = new ArrayList<>();
        clients.add(new Bank("Bank of America", "123 Wall St", "001", 10));
        clients.add(new Company("Tech Corp", "456 Silicon Ave", "002", 500));
        clients.add(new Resident("John Doe", "789 Elm St", "003", "Gold"));
        clients.add(new Restaurant("Tasty Bites", "321 Food St", "004", true));

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);
*/
    }
}