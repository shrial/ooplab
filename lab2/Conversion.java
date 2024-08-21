import java.util.Scanner;
public class Conversion {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter an integer");
        int inte= in.nextInt();
        System.out.println("enter a double");
        double doub= in.nextDouble();
        System.out.println("enter an character");
        char ch = in.next().charAt(0);
        byte intcon=(byte)inte;
        int chcon=(int)ch;
        byte doubcon=(byte)doub;
        int doubcon2=(int)doub;
        System.out.println(inte+" converted to  byte is "+intcon);
        System.out.println(ch+" converted to  integer is "+chcon);
        System.out.println(doub+" converted to  byte is "+doubcon);
        System.out.println(doub+" converted to  integer is "+doubcon2);
    }
    
}
