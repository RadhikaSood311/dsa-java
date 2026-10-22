
package Class;

import java.util.Scanner;

class CircularQueue {
    private final int[] arr;
    private final int capacity;

    private int front;
    private int rear;
    private int count;

    public CircularQueue(int capacity) {

        this.capacity = capacity;
        arr = new int[capacity];

        front = 0;
        rear = -1;
        count = 0;
    }

    // Insert an element at the rear
    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        count++;

        System.out.println(value + " inserted successfully.");
    }

    // Remove the front element
    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        int removed = arr[front];
        front = (front + 1) % capacity;
        count--;

        System.out.println("Removed element: " + removed);
    }

    // View the front element
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Front element: " + arr[front]);
    }

    // Display elements from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }

        System.out.println();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public int size() {
        return count;
    }

    public int capacity() {
        return capacity;
    }
}

public class circularDqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();

        CircularQueue queue;

        try {
            queue = new CircularQueue(capacity);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n--- CIRCULAR QUEUE MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if empty");
            System.out.println("6. Check if full");
            System.out.println("7. Show size");
            System.out.println("8. Show capacity");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    queue.insert(value);
                    break;

                case 2:
                    queue.remove();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println(
                            queue.isEmpty()
                                    ? "Queue is empty."
                                    : "Queue is not empty."
                    );
                    break;

                case 6:
                    System.out.println(
                            queue.isFull()
                                    ? "Queue is full."
                                    : "Queue is not full."
                    );
                    break;

                case 7:
                    System.out.println(
                            "Current size: " + queue.size()
                    );
                    break;

                case 8:
                    System.out.println(
                            "Maximum capacity: " + queue.capacity()
                    );
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
