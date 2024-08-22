import java.util.Scanner;
public class Searcharr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of rows");     
        int m=in.nextInt();    
        System.out.println("enter the number of columns");     
        int n=in.nextInt(); 
        System.out.println("enter the value to be found");
        int key=in.nextInt();
        int arr[][]=new int[m][n],count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("enter the element");
                arr[i][j]=in.nextInt();
                if(arr[i][j]==key){
                    count++;
                }
            
            }
        }
        System.out.println("number of occurence of "+key+" is "+count);
        in.close();
    }
}
