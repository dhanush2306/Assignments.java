package DAY19ASSIGNMENT15;
class SharedResource {

    synchronized void display() {

        System.out.println("Thread entered synchronized block.");

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }

        System.out.println("Thread exiting synchronized block.");
    }
}

public class SleepSynchronizedExample {
    public static void main(String[] args) {

        SharedResource obj = new SharedResource();

        Thread t1 = new Thread(() -> obj.display());
        Thread t2 = new Thread(() -> obj.display());

        t1.start();
        t2.start();
    }
}