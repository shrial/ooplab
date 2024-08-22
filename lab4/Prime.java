import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter size of array");     
        int m=in.nextInt();    
        int arr[]=new int[m],flag=1;
        for(int i=0;i<m;i++){            
            System.out.println("enter the element");
            arr[i]=in.nextInt();                
        }
        System.out.println("Prime numbers in the array are: ");
        for(int i=0;i<m;i++){
            for(int j=3;j<arr[i];j++){                
                if(arr[i]%2==0){
                    flag=0;
                    break;
                }
                else{
                    if(arr[i]%j==0){
                        flag=0;
                        break;
                    }
                }
            }
            if(flag==1 && arr[i]!=1){
                System.out.print(arr[i]+" ");
            }
            flag=1;
        }
        in.close();
    }
}
