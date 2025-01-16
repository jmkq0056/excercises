package four;
public class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, int age, String jobTitle, double salary, double bonus) {
        super(name, age, jobTitle, salary); // Call the constructor of the Employee class
        this.bonus = bonus;
    }

    // Get total salary including bonus
    public double getTotalSalary() {
        return getSalary() + bonus; // getSalary() comes from the Employee class
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }

    // Override toString to include bonus and total salary
    @Override
    public String toString() {
        return super.toString() + ", Bonus: $" + bonus + ", Total Salary: $" + getTotalSalary();
    }
}
