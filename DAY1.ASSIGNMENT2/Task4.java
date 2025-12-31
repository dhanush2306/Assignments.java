import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       

class ContinueProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Program is running...");
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program stopped.");
    }
}
    }
}
