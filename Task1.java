import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
    Scanner laks= new Scanner(System.in);   
    System.out.println("Enter your mark");  
    int obj  =laks.nextInt();   
        int marks = 75;
        if (marks>=35) {
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}