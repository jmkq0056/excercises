public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the multi-class example!");

        // Create a person and display their information
        Person person = new Person("Alice", 30);
        System.out.println(person);

        // Create a calculator instance
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + sum);
    }
}
