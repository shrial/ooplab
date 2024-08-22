import java.util.Scanner;
public class Trace {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of rows");     
        int m=in.nextInt();    
        System.out.println("enter the number of columns");     
        int n=in.nextInt(); 
        int arr[][]=new int[m][n],sum=0,norm=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("enter the element");
                arr[i][j]=in.nextInt();
                if(i==j){
                    sum+=arr[i][j];
                    norm+=(arr[i][j]*arr[i][j]);
                }
            }
        }
        System.out.println("trace and norm are "+sum+" "+(Math.sqrt(norm)));
        in.close();
    }
}
