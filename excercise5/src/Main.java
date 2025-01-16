public class Main {
    public static void main(String[] args) {
        // problem 1
/*
        // Create a Box for a String
        Box<String> stringBox = new Box<>("Hello, Box!");
        System.out.println("String Box Content: " + stringBox.getContent());

        // Update the Box content
        stringBox.setContent("New Content");
        System.out.println("Updated String Box Content: " + stringBox.getContent());

        // Create a Box for an Integer
        Box<Integer> intBox = new Box<>(123);
        System.out.println("Integer Box Content: " + intBox.getContent());

        // Try setting null (this should throw an exception)
        try {
            stringBox.setContent(null); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try creating a Box with null content (this should also throw an exception)
        try {
            Box<String> nullBox = new Box<>(null); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
       }
*/
        // problem 2
/*
        // Create a Pair of a String and an Integer
        Pair<String, Integer> nameAndAge = new Pair<>("Alice", 25);
        System.out.println("Name: " + nameAndAge.getFirst());
        System.out.println("Age: " + nameAndAge.getSecond());

        // Create a Pair of two Integers
        Pair<Integer, Integer> coordinates = new Pair<>(10, 20);
        System.out.println("X Coordinate: " + coordinates.getFirst());
        System.out.println("Y Coordinate: " + coordinates.getSecond());
*/
        // problem 3
/*
        // Create a Pair
        Pair<String, Integer> nameAndAge = new Pair<>("Alice", 25);

        // Swap the Pair
        Pair<Integer, String> swappedPair = nameAndAge.swap();

        // Display the swapped values
        System.out.println("Original Pair: (" + nameAndAge.getFirst() + ", " + nameAndAge.getSecond() + ")");
        System.out.println("Swapped Pair: (" + swappedPair.getFirst() + ", " + swappedPair.getSecond() + ")");
*/

    }
}
