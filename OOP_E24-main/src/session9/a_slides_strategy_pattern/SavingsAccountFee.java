package session9.a_slides_strategy_pattern;

public class SavingsAccountFee implements AccountFeeStrategy{
    @Override
    public double calculateFee(double balance) {
        return 100;
    }
}
