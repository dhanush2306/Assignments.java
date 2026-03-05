package DAY19ASSIGNMENT15;
public class SleepMainThread {
    public static void main(String[] args) {

        System.out.println("Main thread started...");

        try {
            Thread.sleep(3000);  // 3000 ms = 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }

        System.out.println("Main thread resumed after 3 seconds.");
    }
}