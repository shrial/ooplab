import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number");
        int inp= in.nextInt();
        int num= inp;
        int rev=0,rem=0;
        for(int i=0;num>0;i++){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(inp==rev)
        System.out.println("number is palindrome");
        else
        System.out.println("number is not palindrome");
    }
}
