package DAY19ASSIGNMENT15;
class ChildThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted.");
            }
        }
    }
}

public class SleepChildThread {
    public static void main(String[] args) {

        ChildThread t1 = new ChildThread();
        t1.start();

        System.out.println("Main thread continues...");
    }
}