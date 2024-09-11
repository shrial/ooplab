import java.util.Scanner;
public class Searcharr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter number of rows");     
        int m=in.nextInt();    
        System.out.print("enter number of columns");     
        int n=in.nextInt();        
        int arr[][]=new int[m][n],count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("enter element");
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("enter value to be found");
        int key=in.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("number of occurrence of "+key+" is "+count);
        in.close();
    }
}
