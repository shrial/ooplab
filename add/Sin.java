import java.util.Scanner;
public class Sin{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the value of x");
        float x=in.nextFloat();
        float sum=0;int count=0;
        for(int i =1;i<40;i+=2){
            float term=1;float fact=1;
            count++;
            for(int j=1;j<=i;j++){
                term*=x;
                fact*=j;
            }
            if (count%2!=0){
                //System.out.println(fact);
                sum+=(term/fact);}
            else{
                sum-=(term/fact);
            }

        }
        System.out.println("value of sin("+x+") is "+sum);
        in.close();
        
        
    }
    
}
