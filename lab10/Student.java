import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNumber = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Marks in three subjects: ");
            int m1 = Integer.parseInt(sc.nextLine());
            int m2 = Integer.parseInt(sc.nextLine());
            int m3 = Integer.parseInt(sc.nextLine());

            int total = m1 + m2 + m3;
            double percentage = total / 3.0;
            char grade = (percentage >= 90) ? 'A' : (percentage >= 75) ? 'B' : (percentage >= 50) ? 'C' : 'D';

            System.out.println("Name: " + name + ", Roll No: " + rollNumber);
            System.out.println("Percentage: " + percentage + "%, Grade: " + grade);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for roll number and marks.");
        }
        sc.close();
    }
}
