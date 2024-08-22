import java.util.Scanner;
public class AddMultArr {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("first array for addition: ");
        System.out.println("enter the number of rows");     
        int m=in.nextInt();    
        System.out.println("enter the number of columns");     
        int n=in.nextInt(); 
        int arr1[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("enter the element");
                arr1[i][j]=in.nextInt();                
            }
        }

        System.out.println("second array for addition : ");
        int a=m, b=n;
        int arr2[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println("enter the element");
                arr2[i][j]=in.nextInt();                
            }
        }

        int sum[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];           
            }
        }
        System.out.println("sum matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]);         
            }
            System.out.println("");
        }
        
        System.out.println("first array for multiplication");
        System.out.println("enter the number of rows");     
        int c=in.nextInt();    
        System.out.println("enter the number of columns");     
        int d=in.nextInt(); 
        int arr3[][]=new int[c][d];
        for(int i=0;i<c;i++){
            for(int j=0;j<d;j++){
                System.out.println("enter the element");
                arr3[i][j]=in.nextInt();                
            }
        }

        System.out.println("second  array for multiplication");
        System.out.println("enter the number of rows");     
        int s=in.nextInt();    
        System.out.println("enter the number of columns");     
        int t=in.nextInt(); 
        int arr4[][]=new int[s][t];
        for(int i=0;i<s;i++){
            for(int j=0;j<t;j++){
                System.out.println("enter the element");
                arr3[i][j]=in.nextInt();                
            }
        }
        

        in.close();
    }
}
