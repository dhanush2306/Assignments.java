import java.util.Scanner;

class Deque {
    int front, rear, size;
    int[] dequeArray;

    Deque(int capacity) {
        size = capacity;
        dequeArray = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    boolean isEmpty() {
        return front == -1;
    }

    void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque Overflow! Cannot insert at front.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }

        dequeArray[front] = value;
        System.out.println(value + " inserted at front.");
    }

    void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque Overflow! Cannot insert at rear.");
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
        System.out.println(value + " inserted at rear.");
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
}

public class DequeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque deque = new Deque(5);

        int choice;

        do {
            System.out.println("\n1. Insert Front");
            System.out.println("2. Insert Rear");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int valFront = sc.nextInt();
                    deque.insertFront(valFront);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int valRear = sc.nextInt();
                    deque.insertRear(valRear);
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