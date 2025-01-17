package session9.a_slides_strategy_pattern;

public class SavingsAccountInterest implements InterestStrategy {
    private double interestRate;
    public SavingsAccountInterest(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterest(double balance) {
        if (balance > 1_000_000)
            return balance * 2*this.interestRate;
        else
            return balance * this.interestRate;
    }
}
