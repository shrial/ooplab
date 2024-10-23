import java.util.Scanner;

class Counter {
    int count = 0; // Public data member

    // Synchronized method
    public synchronized void increment() {
        count++;
    }

    // Method using synchronized block
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }
}

class IncrementThread extends Thread {
    Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment(); // Using synchronized method
        }
    }
}

class DecrementThread extends Thread {
    Counter counter;

    public DecrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            counter.decrement(); // Using synchronized block
        }
    }
}

public class Sync {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Counter counter = new Counter();

        System.out.println("Starting threads...");

        IncrementThread incrementThread = new IncrementThread(counter);
        DecrementThread decrementThread = new DecrementThread(counter);

        incrementThread.start();
        decrementThread.start();

        try {
            incrementThread.join(); // Wait for incrementThread to finish
            decrementThread.join(); // Wait for decrementThread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final Counter Value: " + counter.count);
        sc.close();
    }
}
