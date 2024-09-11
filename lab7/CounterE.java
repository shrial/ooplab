import java.util.Scanner;
class Counter{
    static int count=0;
    Counter(){
        count+=1;
    }
}

public class CounterE{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       boolean resp=true;
       while(resp){
        Counter c=new Counter();
        System.out.println("one object created");
        System.out.println("do you want to continue(true/false)");
        resp=sc.nextBoolean();
       }
       System.out.println("number of objects created:"+Counter.count);
       sc.close();
    }
}