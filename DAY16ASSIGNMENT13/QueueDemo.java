import java.util.Scanner;

class Queue {
    int front, rear, capacity;
    int[] queueArray;

    Queue(int size) {
        capacity = size;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
    }

    boolean isFull() {
        return rear == capacity - 1;
    }

    boolean isEmpty() {
        return front > rear;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + value);
        } else {
            queueArray[++rear] = value;
            System.out.println(value + " inserted into queue.");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty.");
        } else {
            System.out.println(queueArray[front] + " removed from queue.");
            front++;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is: " + queueArray[front]);
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queueArray[i]);
            }
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(5);

        int choice;

        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}