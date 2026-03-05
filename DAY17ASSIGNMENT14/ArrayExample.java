public class ArrayExample {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range.");
        }
    }
}