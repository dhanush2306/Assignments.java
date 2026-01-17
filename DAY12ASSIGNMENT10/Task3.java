package DAY12ASSIGNMENT10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K value ( +K = Right, -K = Left ): ");
        int k = sc.nextInt();

        k = k % n;   

        if (k > 0) {
            
            for (int i = 0; i < k; i++) {
                int last = arr[n - 1];
                for (int j = n - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }
        } 
        else if (k < 0) {
            k = -k; 
            
            for (int i = 0; i < k; i++) {
                int first = arr[0];
                for (int j = 0; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = first;
            }
        }

        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
