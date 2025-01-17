package session9.a_slides_strategy_pattern;

import java.util.Scanner;

/*
    **Java Exercise: Strategy Pattern**

    **Task:** Modify the `BankAccount` class to use the Strategy Design Pattern for applying account fees.

    **Description:**
    1. Define an `AccountFeeStrategy` interface with a method `calculateFee`.
    2. Implement two strategies:
        - `SavingsAccountFee`: A fixed annual fee of 100 krones.
        - `CheckingAccountFee`: A fixed annual fee of 200 krones.
    3. Add a method `applyFee` to the `BankAccount` class:
        - Use the fee strategy to deduct the annual fee from the account balance.
        - Ensure that fees are applied correctly based on the account type.

    **Feedback Section:** Uncomment the feedback section in the main method to provide your input on the exercise.
*/
public class Exercise {
    public static void main(String[] args) {
        // Example for setting and using the fee strategy:
        InterestStrategy savingsAccountInterest = new SavingsAccountInterest(0.05);
        InterestStrategy checkingAccountInterest = new CheckingAccountInterest();

        AccountFeeStrategy savingsAccountFee = new CheckingAccountFee();
        AccountFeeStrategy checkingAccountFee = new CheckingAccountFee();

        BankAccount savingsAccount = new BankAccount(1000, savingsAccountInterest, savingsAccountFee);
        BankAccount checkingAccount = new BankAccount(1000, checkingAccountInterest, checkingAccountFee);

        System.out.println("Initial Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.applyFee();
        System.out.println("Savings Account Balance After Fee: " + savingsAccount.getBalance());

        System.out.println("Initial Checking Account Balance: " + checkingAccount.getBalance());
        checkingAccount.applyFee();
        System.out.println("Checking Account Balance After Fee: " + checkingAccount.getBalance());



        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session9_A", I_did_finish, I_did_understand, comment);
        */
    }
}
