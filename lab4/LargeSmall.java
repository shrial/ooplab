import java.util.Scanner;
public class LargeSmall {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter size of array");     
        int m=in.nextInt();    
        int arr[]=new int[m];
        for(int i=0;i<m;i++){            
            System.out.println("enter the element");
            arr[i]=in.nextInt();                
        }
        int large=arr[0],small=arr[0];
        for(int i=1;i<m;i++){            
           if(arr[i]>large)
           large=arr[i];
           if(arr[i]<small) 
           small=arr[i];              
        }
        System.out.println("the largest and smallest element are "+large+" and "+small);
        in.close();
    }
}
