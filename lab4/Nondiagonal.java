import java.util.Scanner;
public class Nondiagonal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("you must enter a square matrix");     
        System.out.println("enter the number of rows and columns");       
        int m=in.nextInt();     
        int arr[][]=new int[m][m],sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter the element");
                arr[i][j]=in.nextInt();
                if(i!=j && (i+j)!=(m-1) ){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("non diagonal elements are: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if (i!=j && (i+j)!=(m-1) ){
                System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println("sum of non diagonal elements are "+sum);
        in.close();
    }
}
