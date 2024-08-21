import java.util.Scanner;
public class Largest {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter first number");
        int num1=in.nextInt();
        System.out.println("enter second number");
        int num2=in.nextInt();
        System.out.println("enter third number");
        int num3=in.nextInt();
        int large=0,small=0;
        large=num1>num2?num1:num2;
        small=num1<num2?num1:num2;
        large=large>num3?large:num3;
        small=small<num3?small:num3;
        System.out.println("largest number is "+large);
        System.out.println("smallest number is "+small);
    }
    
}
