import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       

class MobileNumberValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mobile;

        do {
            System.out.print("Enter your 10-digit mobile number: ");
            mobile = sc.next();
            if (mobile.length() != 10) {
                System.out.println("Invalid number! Please try again.");
            }
        } while (mobile.length() != 10);

        System.out.println("Mobile number accepted: " + mobile);
    }
}
    }
}
