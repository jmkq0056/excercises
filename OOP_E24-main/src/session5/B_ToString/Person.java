package session5.B_ToString;

public class Person {
    String name;
    int age;

    public Person(String firstName, int age) {
        this.name = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        //Create the object
        Person person1 = new Person("Anders Madsen", 38);
        String string = person1.toString();
        System.out.println(string);

        Person person2 = new Person("Anders Madsen", 38);
        System.out.println(person2.toString());

    }

}
