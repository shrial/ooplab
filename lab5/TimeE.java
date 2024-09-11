package lab5;
import java.util.Scanner;
class Time{
    int hour;
    int min;
    int sec;
    Time(){}
    Time(int h,int m,int s){
        hour=h;
        min=m;
        sec=s;
    }
    void display(){
        System.out.println("Sum of times is: "+hour+":"+min+":"+sec);
    }
    static Time add(Time t1,Time t2){
        int a=(t1.hour*3600)+(t1.min*60)+t1.sec;
        int b=(t2.hour*3600)+(t2.min*60)+t2.sec;
        Time re=new Time();
        int sum=a+b;
        re.hour=sum/3600;
        sum%=3600;
        re.min=sum/60;
        re.sec=sum%60;
        return re;
    }
}

public class TimeE {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Time t1=new Time();
    System.out.print("enter hour ");
    int h=in.nextInt();
    System.out.print("enter minutes ");
    int m=in.nextInt();
    System.out.print("enter seconds ");
    int s=in.nextInt();
    Time t2=new Time(h, m, s);
    System.out.print("enter hour ");
    int h2=in.nextInt();
    System.out.print("enter minutes ");
    int m2=in.nextInt();
    System.out.print("enter seconds ");
    int s2=in.nextInt();
    Time t3=new Time(h2, m2, s2);
    Time sum=Time.add(t2,t3);
    sum.display();
    in.close();
}
}
