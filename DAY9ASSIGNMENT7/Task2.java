package DAY9ASSIGNMENT7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int n = sc.nextInt();
        int []arr =  new int[n];
        System.out.println("Enter array elements :");
        for ( int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
            for(int i = 0 ; i<n; i++){
                if (arr[i]<0) {
                    arr[i]=0;
                }
            }
            System.out.println("updated array:");
            for (int i =0;i<n;i++){
                System.out.println(arr[i]+"  ");
         }
    }
}
