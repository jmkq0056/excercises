package session2.E_Encapsulation;

import session2.E_Encapsulation.exercise.Person;

public class Exercise {

    public static void main(String[] args) {
        // Creating Person object without a middle name
        Person person1 = new Person("John", "Doe", 30);
        System.out.println(person1.getFullName());

        person1.setFirstName("Mike");


        // Creating Person object with a middle name
        Person person2 = new Person("Jane", "Alice", "Smith", 28);


        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_D_Constructors", I_did_finish, I_did_understand, comment);
        */
    }
}
