import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        char resp='y';
        

        do{
            System.out.println("enter first number");
            float num1= in.nextFloat();
            System.out.println("enter second number");
            float num2=in.nextFloat();
            System.out.println("enter the operator(+,-,*,/)");
            char op=in.next().charAt(0);
            switch(op){
                case '+':
                float sum=num1+num2;
                System.out.println("sum of numbers is "+sum);
                break;
                case '-':
                float diff=num1-num2;
                System.out.println("difference of numbers is "+diff);
                break;
                case '*':
                float prod=num1*num2;
                System.out.println("product of numbers is "+prod);
                break;
                case '/':
                if (num2==0){
                    System.out.println("Division by zero!");
                    continue;
                }
                else{
                float div=num1/num2;
                System.out.println("division of numbers is "+div);
                break;}
            }
            System.out.println("Do you want to continue(y/n)");
            resp=in.next().charAt(0);
        }while(resp=='y');

    }
    
}
