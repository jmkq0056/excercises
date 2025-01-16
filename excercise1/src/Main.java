import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Problem 1: Convert feet to meters
        System.out.print("Enter length in feet: ");
        double feet = scanner.nextDouble();
        double meters = feet * 0.3048;
        System.out.println("Length in meters: " + meters);

        // Problem 2: Check if a character is a vowel or consonant
        System.out.print("Enter a single character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
                break;
        }

        // Problem 3: Convert between Fahrenheit and Celsius
        System.out.print("Enter 1 to convert Celsius to Fahrenheit or 2 for Fahrenheit to Celsius: ");
        int choice = scanner.nextInt();
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        if (choice == 1) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        }

        // Problem 4: Convert milliseconds to days, hours, minutes, and seconds
        System.out.print("Enter duration in milliseconds: ");
        long milliseconds = scanner.nextLong();
        long seconds = (milliseconds / 1000) % 60;
        long minutes = (milliseconds / (1000 * 60)) % 60;
        long hours = (milliseconds / (1000 * 60 * 60)) % 24;
        long days = milliseconds / (1000 * 60 * 60 * 24);
        System.out.printf("Duration: %d days, %d hours, %d minutes, %d seconds\n", days, hours, minutes, seconds);

        // Problem 5: Guessing Game
        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1;
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();
        if (guess == secretNumber) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("Wrong! The number was: " + secretNumber);
        }

        // Problem 6: Count vowels and consonants in a string
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume leftover newline
        String inputString = scanner.nextLine().toLowerCase();
        int vowelsCount = 0, consonantsCount = 0;
        for (char c : inputString.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) >= 0) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);

        // Problem 7: Find prime numbers between 2 and 100
        System.out.println("Prime numbers between 2 and 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }

    // Helper function for Problem 7
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
