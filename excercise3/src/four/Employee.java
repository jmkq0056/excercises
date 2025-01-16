package four;
public class Employee extends Person {
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age); // Call the constructor of the Person class
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getters
    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString to include jobTitle and salary
    @Override
    public String toString() {
        return super.toString() + ", Job Title: " + jobTitle + ", Salary: $" + salary;
    }
}
