import java.util.Scanner;

class Task4Deque {
    int front, rear, size;
    int[] dequeArray;

    Task4Deque(int capacity) {
        size = capacity;
        dequeArray = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque Underflow! Cannot delete from front.");
            return;
        }

        System.out.println(dequeArray[front] + " removed from front.");

        if (front == rear) {
            front = rear = -1;
        }
        else if (front == size - 1) {
            front = 0;
        }
        else {
            front++;
        }
    }
    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque Underflow! Cannot delete from rear.");
            return;
        }

        System.out.println(dequeArray[rear] + " removed from rear.");

        if (front == rear) {
            front = rear = -1;
        }
        else if (rear == 0) {
            rear = size - 1;
        }
        else {
            rear--;
        }
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        System.out.println("Deque elements:");
        int i = front;
        while (true) {
            System.out.println(dequeArray[i]);
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
    }

    void insertRear(int value) {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Deque Overflow!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }

        dequeArray[rear] = value;
    }
}

public class DequeDeleteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque deque = new Deque(5);

        deque.insertRear(10);
        deque.insertRear(20);
        deque.insertRear(30);

        int choice;

        do {
            System.out.println("\n1. Delete Front");
            System.out.println("2. Delete Rear");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deque.deleteFront();
                    break;
                case 2:
                    deque.deleteRear();
                    break;
                case 3:
                    deque.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}