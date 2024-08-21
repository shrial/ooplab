import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        int sum=0,rem,ch;
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number");
        int num=in.nextInt();
        ch=num;
        for(int i=0;ch!=0;i++){
            rem=ch%10;
            sum+=(rem*rem*rem);
            ch/=10;
        }
        if(sum==num){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println(num+" is not an armstrong number");
        }
        in.close();
    }
}