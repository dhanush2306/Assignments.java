
package DAY8ASSIGNMENT6;

class Account {
    void accountDetails() {
        System.out.println("Account Holder: John Doe");
        System.out.println("Account Number: 123456789");
        System.out.println("Account Type: Premium Account");
    }
}

interface Savings {
    void calculateInterest();
}

interface Current {
    void overdraftLimit();
}

class PremiumAccount extends Account implements Savings, Current {

    @Override
    public void calculateInterest() {
        System.out.println("Savings Account Interest: 6% per annum");
    }

    @Override
    public void overdraftLimit() {
        System.out.println("Overdraft Limit: Rs. 50,000");
    }
}
public class Task2{
    public static void main(String[] args) {

        PremiumAccount pa = new PremiumAccount();

        pa.accountDetails();   
        pa.calculateInterest();  
        pa.overdraftLimit();     
}
}