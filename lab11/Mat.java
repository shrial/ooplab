import java.util.Scanner;

class Matrix {
    int[][] matrix;
    int size;

    public Matrix(int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    public void fillMatrix(Scanner sc) {
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}

class DisplayThread extends Thread {
    Matrix matrix;
    String type;

    public DisplayThread(Matrix matrix, String type) {
        this.matrix = matrix;
        this.type = type;
    }

    public void run() {
        switch (type) {
            case "matrix":
                displayMatrix();
                break;
            case "transpose":
                displayTranspose();
                break;
            case "max":
                displayMax();
                break;
            case "diagonal":
                displayPrincipalDiagonal();
                break;
            case "non-diagonal":
                displayNonDiagonal();
                break;
        }
    }

    private void displayMatrix() {
        System.out.println("Matrix:");
        for (int[] row : matrix.matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    private void displayTranspose() {
        System.out.println("Transpose:");
        for (int i = 0; i < matrix.size; i++) {
            for (int j = 0; j < matrix.size; j++) {
                System.out.print(matrix.matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    private void displayMax() {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix.matrix) {
            for (int elem : row) {
                if (elem > max) max = elem;
            }
        }
        System.out.println("Maximum value in the matrix: " + max);
    }

    private void displayPrincipalDiagonal() {
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < matrix.size; i++) {
            System.out.print(matrix.matrix[i][i] + " ");
        }
        System.out.println();
    }

    private void displayNonDiagonal() {
        System.out.print("Non-Diagonal Elements: ");
        for (int i = 0; i < matrix.size; i++) {
            for (int j = 0; j < matrix.size; j++) {
                if (i != j) {
                    System.out.print(matrix.matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}

public class Mat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = sc.nextInt();

        Matrix matrix = new Matrix(size);
        matrix.fillMatrix(sc);

        // Creating multiple instances of DisplayThread
        Thread t1 = new DisplayThread(matrix, "matrix");
        Thread t2 = new DisplayThread(matrix, "transpose");
        Thread t3 = new DisplayThread(matrix, "max");
        Thread t4 = new DisplayThread(matrix, "diagonal");
        Thread t5 = new DisplayThread(matrix, "non-diagonal");

        // Starting the threads
        
        // Checking if threads are alive and waiting for them to finish
        try {
            t1.start();
            System.out.println("Thread t1 is alive: " + t1.isAlive());
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            System.out.println("Thread t2 is alive: " + t2.isAlive());
            t3.join();
            t4.start();
            t4.join();
            t5.start();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        sc.close();
    }
}
