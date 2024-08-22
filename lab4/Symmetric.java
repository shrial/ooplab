import java.util.Scanner;
public class Symmetric {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of rows and columns");       
        int m=in.nextInt(),flag=1;     
        int arr[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter the element");
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i!=j){
                    if(arr[i][j]!=arr[j][i]){
                        flag=0;
                        break;
                    }
                }
            }
            if(flag==0)
            break;
        }
    if(flag==1){
        System.out.println("matrix is symmetric");
    }
    else{
        System.out.println("matrix is not symmetric");
    }
    in.close();
}
}   
