
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin =2306;
        int enteredPin =0;
       while (enteredPin !=correctPin) {
        System.out.println("eneter your pin");
        enteredPin = sc.nextInt();
        if (enteredPin !=correctPin) {
            System.out.println("wrong pin !! try again");
        }
        }
        System.out.println("pin correct!! Access granted");
        sc.close();
    }
}
