import java.util.Scanner;
public class MultDiv {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int num=in.nextInt();
        System.out.println("do u want *2(m) or /2(d)");
        char op=in.next().charAt(0);
        if (op=='m'){
            int res= num<<1;
            System.out.println("result is "+res);
        }
        else if(op=='d'){
            int res=num>>1;
            System.out.println("result is "+res);
        }
        else{
            System.out.println("wrong input");
        }
    }
    
}
