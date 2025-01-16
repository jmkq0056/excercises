public class BankAccount {
    private double balance; // Current balance in the account
    private double borrowingRate; // Borrowing interest rate (%)
    private double savingsRate;   // Savings interest rate (%)

    // Constants for invariants
    private static final double MIN_BALANCE = -100_000.0;
    private static final double MAX_BALANCE = 250_000.0;
    private static final double MIN_BORROWING_RATE = 6.0;
    private static final double MAX_SAVINGS_RATE = 2.0;

    // Constructor
    public BankAccount(double initialBalance, double borrowingRate, double savingsRate) {
        if (initialBalance < MIN_BALANCE || initialBalance > MAX_BALANCE) {
            throw new IllegalArgumentException("Initial balance must be between " + MIN_BALANCE + " and " + MAX_BALANCE);
        }
        if (borrowingRate < MIN_BORROWING_RATE) {
            throw new IllegalArgumentException("Borrowing rate must be at least " + MIN_BORROWING_RATE + "%");
        }
        if (savingsRate > MAX_SAVINGS_RATE) {
            throw new IllegalArgumentException("Savings rate must be at most " + MAX_SAVINGS_RATE + "%");
        }
        this.balance = initialBalance;
        this.borrowingRate = borrowingRate;
        this.savingsRate = savingsRate;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        if (balance + amount > MAX_BALANCE) {
            throw new IllegalArgumentException("Deposit exceeds maximum balance limit.");
        }
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }
        if (balance - amount < MIN_BALANCE) {
            throw new IllegalArgumentException("Withdrawal exceeds minimum balance limit.");
        }
        balance -= amount;
    }

    // Method to accrue or charge interest
    public void applyInterest() {
        if (balance > 0) {
            balance += balance * (savingsRate / 100);
        } else {
            balance -= Math.abs(balance) * (borrowingRate / 100);
        }
        // Ensure balance stays within limits
        if (balance > MAX_BALANCE) balance = MAX_BALANCE;
        if (balance < MIN_BALANCE) balance = MIN_BALANCE;
    }

    // Method to adjust borrowing rate
    public void setBorrowingRate(double newRate) {
        if (newRate < MIN_BORROWING_RATE) {
            throw new IllegalArgumentException("Borrowing rate must be at least " + MIN_BORROWING_RATE + "%.");
        }
        this.borrowingRate = newRate;
    }

    // Method to adjust savings rate
    public void setSavingsRate(double newRate) {
        if (newRate > MAX_SAVINGS_RATE) {
            throw new IllegalArgumentException("Savings rate must be at most " + MAX_SAVINGS_RATE + "%.");
        }
        this.savingsRate = newRate;
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public double getBorrowingRate() {
        return borrowingRate;
    }

    public double getSavingsRate() {
        return savingsRate;
    }

    @Override
    public String toString() {
        return "BankAccount [Balance: " + balance + ", Borrowing Rate: " + borrowingRate +
                "%, Savings Rate: " + savingsRate + "%]";
    }
}
