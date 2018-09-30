package ch771;

public class Transactions {
    public static void main(String[] args) {
        Account acct1 = new Account("Jack", 11111);
        Account acct2 = new Account("Joe", 22222, 12345.00);
        Account acct3 = new Account("John", 33333);
        acct1.deposit(1234);
        double JoeBalance = acct2.deposit(1234.00);
        System.out.println("Joe's balance after deposit: $" + JoeBalance);
        System.out.println("Joe balance after withdrawal: $" + acct2.withdraw(1234, 0));
        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();
        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
