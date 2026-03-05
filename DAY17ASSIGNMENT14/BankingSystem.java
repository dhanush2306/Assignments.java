class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}