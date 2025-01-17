package session9.a_slides_strategy_pattern;

public class Demo {

    public static void main(String[] args) {
        InterestStrategy savingsAccountInterest = new SavingsAccountInterest(0.05);
        AccountFeeStrategy checkingAccountFee = new CheckingAccountFee();
        AccountFeeStrategy noFeeAccount = new NoFeeAccount();

        BankAccount bankAccount = new BankAccount(100,
                                                savingsAccountInterest, noFeeAccount);

        System.out.println("Total Balance: "+bankAccount.getBalance());

        bankAccount.accrueInterest();

        System.out.println("Total Balance: "+bankAccount.getBalance());
    }
}
