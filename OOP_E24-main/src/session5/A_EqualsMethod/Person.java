package session5.A_EqualsMethod;

import java.util.Objects;

public class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //First, we go through a reference comparison
        if (this == o) return true;

        //Second, we discard nulls or object with different classes.
        if (o == null || this.getClass() != o.getClass()) return false;

        //Finally, we do the comparison based on the criteria we have defined.
        Person person = (Person) o; //we do casting.

        //Objects.equals(name, person.name) delage the comparison to the String class.
        //return this.age == person.age && Objects.equals(name, person.name);

        return this.age == person.age && this.name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {

        //Create the object
        Person person1 = new Person("Anders Madsen", 38);

        Person person2 = new Person("Anders Madsen", 38);

        if (person1==person2)
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");


        if (person1.equals(person2))
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");



        System.out.println("HashCode of Person 1 : " + person1.hashCode());

        System.out.println("HashCode of Person 2 : " + person2.hashCode());
    }

}
