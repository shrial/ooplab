import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number");
        int num=in.nextInt();
        int fact=1;
        for (int i=1;i<=num;i++){
            fact= fact*i;
        }
        System.out.println(" factorial of "+num+" is "+fact);
    }
}
