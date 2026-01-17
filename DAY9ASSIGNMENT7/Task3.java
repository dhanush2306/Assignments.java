package DAY9ASSIGNMENT7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements:");
        int n = sc.nextInt();
        int []arr= new int[n];
        System.out.println("enter the array elements:");
        for ( int i= 0; i < n;i++){
arr[i]= sc.nextInt();
        }
        System.out.println("Reversed array Are:");
        for(int i =n-1;i>=n;i-- ){
System.out.println(arr[i]+" ");
        }
    }
}
