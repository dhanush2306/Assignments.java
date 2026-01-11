package DAY7ASSIGNMENT5;
interface Payment {
    void pay();
}


class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}


class UPIPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}
public class Task4 {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.pay();

        Payment p2 = new UPIPayment();
        p2.pay();
    }
}