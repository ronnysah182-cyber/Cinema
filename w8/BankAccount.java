package w8;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount {

    int accountNumber;
    double balance;
    String accountholdername;

    public BankAccount(int accountNumber, double balance, String accountholdername) {
        this.accountNumber = accountNumber;
        this.accountholdername = accountholdername;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountholdername + " Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountholdername + " Withdrew: " + amount);
        } else {
            System.out.println("Your withdraw amount is more than your balance");
        }
    }

    public void current_balance() {
        System.out.println(accountholdername + " Current balance is: " + balance);
    }
}
