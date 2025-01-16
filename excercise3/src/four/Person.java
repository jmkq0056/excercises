package four;
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override toString for better readability
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
