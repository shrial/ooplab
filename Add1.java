import java.util.Scanner;
public class Add1 {
    public static void main(String[] args) {
    int a,b;
    Scanner in=new Scanner(System.in);
    System.out.println("enter a number");
    a=in.nextInt();
    System.out.println("enter a number");
    b=in.nextInt();
    /*part a */int c=(a << 2) + (b >> 2);
    /*part b */boolean d=(b > 0);
    /*part c */int e=(a + b * 100) / 10;
    /*part d */int f= (a & b);
   System.out.println("output of part a is "+c);
   System.out.println("output of part b is "+d);
   System.out.println("output of part c is "+e);
   System.out.println("output of part d is "+f);
}}
