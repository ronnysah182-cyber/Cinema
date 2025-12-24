package w8;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {

        BankAccount Ba1 = new BankAccount(1234, 300000.00, "Prabesh sitau");
        BankAccount Ba2 = new BankAccount(12345, 50000.00, "Pankil sang");

        Ba1.deposit(4000);
        Ba1.withdraw(1000);
        Ba1.current_balance();

        Ba2.deposit(50000);
        Ba2.withdraw(7000);
        Ba2.current_balance();
    }
}
