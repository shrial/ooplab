import java.util.Scanner;

public class SetP extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + i);
                Thread.sleep(500); // Sleep for 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SetP thread = new SetP();

        System.out.print("Enter thread priority (1 to 10): ");
        int priority = sc.nextInt();

        thread.setPriority(priority); // Set the priority
        System.out.println("Thread priority set to: " + thread.getPriority());

        thread.start(); // Start the thread

        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        sc.close();
    }
}
