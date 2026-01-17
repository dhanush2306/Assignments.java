package DAY11ASSIGNMENT9;

public class Task1 {
    public static void main(String[] args) {
    int n=5;
     System.out.println("Pattern 1:");
        char[][] p1 = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                p1[i][j] = '*';
                System.out.print(p1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

             System.out.println("Pattern 2:");
        int[][] p2 = new int[n][n];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                p2[i][j] = j + 1;
                System.out.print(p2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    
                System.out.println("Pattern 3:");
        char[][] p3 = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p3[i][j] = '*';
                System.out.print(p3[i][j]);
            }
            System.out.println();
        }
}
}