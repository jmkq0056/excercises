package session8.a_bankaccount;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            String msg = "Amount must be positive.";
            throw new IllegalArgumentException(msg);
        }
        if (amount >= balance) {
            String msg = "Amount must be less than balance.";
            throw new IllegalArgumentException(msg);
        }
        balance = balance - amount;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            String msg = "Cannot deposit negative amount. Please try again.";
            IllegalArgumentException e = new IllegalArgumentException(msg);
            throw e;
        }
        balance = balance + amount;
    }
}