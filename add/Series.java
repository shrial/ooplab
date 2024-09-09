import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sum=0,term=1;
        System.out.println("enter number of terms");
        float n=sc.nextFloat();
        for(float i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                term*=(1/i);
            }
            sum+=term;
            term=1;

        }
        System.out.println("sum of the series is: "+sum);
        sc.close();
    }
}
