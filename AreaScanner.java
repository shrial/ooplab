import java.util.Scanner;
public class AreaScanner{
    public static void main(String args[]){
        int length,breadth,area,circumference;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the length");
        length= in.nextInt();
        System.out.println("enter the breadth");
        breadth= in.nextInt();
        area= length*breadth;
        circumference=2*(length+ breadth);
        System.out.println("area of the rectangle is "+area+" and circumference is "+circumference);
    }
}