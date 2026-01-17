package DAY10ASSIGNMENT8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        boolean isEqual = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] != b[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("Matrices are equal");
        } else {
            System.out.println("Matrices are not equal");
        }
    }
}
