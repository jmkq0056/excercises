package session2.D_Constructors.exercise;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name.
 *  a) Create two constructors for this class.
 *      * A constructor to create Person objects with middle name.
 *      * A constructor to create Person objects without middle name.
 *  b) Add a method that return true/false to indicate if the person has or does not have a middle name.
 *  c) Add a method that outputs the person's information as a string formatted as:
 *      * E.g. ”Anders, Madsen” if there is no middle name.
 *      * E.g. ”Anders, M., Madsen” if there is a middle name.
 **/
class Person {
    String firstName;
    String middleName;
    String lastName;

    // Constructor for person without a middle name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = null; // No middle name
    }

    // Constructor for person with a middle name
    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Method to check if person has a middle name
    public boolean hasMiddleName() {
        return middleName != null;
    }

    // Method to return formatted person's information
    public String getPersonInfo() {
        if (this.hasMiddleName()) {
            return String.format("%s, %s., %s", firstName, middleName, lastName);
        } else {
            return String.format("%s, %s", firstName, lastName);
        }
    }

    public static void main(String[] args) {
        // Test cases
        Person person1 = new Person("Anders", "Madsen");
        Person person2 = new Person("Anders", "M", "Madsen");

        System.out.println(person1.getPersonInfo()); // Outputs: Anders, Madsen
        System.out.println(person2.getPersonInfo()); // Outputs: Anders, M., Madsen

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
