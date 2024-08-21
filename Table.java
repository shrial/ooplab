import java.util.Scanner;
public class Table{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number");
        int num=in.nextInt();
        System.out.println("enter the limit");
        int lim=in.nextInt();
        System.out.println("table of "+num+" :");
        for (int i=1;i<=lim;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }

    }

}