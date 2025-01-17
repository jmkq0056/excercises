package session9.a_slides_strategy_pattern;

public class NoFeeAccount implements AccountFeeStrategy{
    @Override
    public double calculateFee(double balance) {
        return 0;
    }
}
