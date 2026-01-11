package DAY7ASSIGNMENT5;
abstract class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
public class Task3 {
    public static void main(String[] args) {

        BankAccount account = new SavingsAccount(5000);

        account.displayBalance();
        account.deposit(2000);
        account.displayBalance();
        account.withdraw(3000);
        account.displayBalance();
    }
}