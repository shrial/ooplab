package lab5;
import java.util.Scanner;
class Number{
    private double num;
    Number(){}
    Number(double n){
        num=n;
    }
    Boolean isZero(){
        return (num==0);
    }
    Boolean isPositive(){
        return (num>0);
    }
    Boolean isNegative(){
        return (num<0);
    }
    Boolean isOdd(){
        return (num%2!=0);
    }
    Boolean isEven(){
        return (num%2==0);
    }
    Boolean isPrime(){
        int flag=1;
        for(int i=2;i<num&&num!=2;i++){
            if(num%i==0){
                flag=0;
                break;
            }
        }
        return (flag==1&&num!=1);
       
    }
    Boolean isArmstrong(){
        int sum=0;
        int ch,rem;
        ch=(int)num;
        for(@SuppressWarnings("unused")
        int i=0;ch!=0;i++){
            rem=ch%10;
            sum+=(rem*rem*rem);
            ch/=10;
        }
        return (num==sum);
    }
}
public class NumberE {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number");
        int n=in.nextInt();
        Number no=new Number(n);
        boolean f1=no.isZero();
        boolean f2=no.isPositive();
        boolean f3=no.isNegative();
        boolean f4=no.isOdd();
        boolean f5=no.isEven();
        boolean f6=no.isPrime();
        boolean f7=no.isArmstrong();
        if(f1){
            System.out.println("number is zero");}
        if(f2){
            System.out.println("number is positive");}
        if(f3){
            System.out.println("number is negative");}
        if(f4){
            System.out.println("number is odd");}
        if(f5){
            System.out.println("number is even");}
        if(f6){
            System.out.println("number is prime number");}
        if(f7){
            System.out.println("number is armstrong number");}
        in.close();
    }
}
