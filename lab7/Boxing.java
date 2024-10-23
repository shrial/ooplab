import java.util.Scanner;
public class Boxing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer");
        int a=sc.nextInt();
        Integer x=a; //Autoboxing
        x+=10;
        int c=x.intValue(); //Unboxing
        System.out.println("Autoboxed Value: "+x);
        System.out.println("Unboxed Value: "+c);
        sc.close();
    }
}