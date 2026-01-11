package DAY8ASSIGNMENT6;
class User {
    void login() {
        System.out.println("User logged in");
    }
}

class Admin extends User {
    void managePlatform() {
        System.out.println("Admin is managing the platform");
    }
}
class Seller extends User {
    void addProduct() {
        System.out.println("Seller added a product");
    }
}
class Customer extends User {
    void placeOrder() {
        System.out.println("Customer placed an order");
    }
}
public class Task5{
    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.login();
        admin.managePlatform();

        System.out.println();

        Seller seller = new Seller();
        seller.login();
        seller.addProduct();

        System.out.println();

        Customer customer = new Customer();
        customer.login();
        customer.placeOrder();
    }
}