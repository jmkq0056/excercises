package session9.b_slides_observer_pattern;


public class SkatMonitor implements AccountListener {

    @Override
    public void notify(double newBalance, double oldBalance) {
        double deposit = newBalance - oldBalance;
        if (deposit > 1_000_000)
            System.out.println("ALERT!!!");
    }
}
