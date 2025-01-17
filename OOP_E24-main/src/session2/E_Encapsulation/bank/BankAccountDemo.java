package session2.E_Encapsulation.bank;


public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Andres Masegosa", 100);

        account.fullName="Anders Madsen";

        account.withdraw(75_000);

        account.balance=500_000;

        System.out.println(account.balance);

    }

}
