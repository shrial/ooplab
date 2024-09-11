import java.util.Scanner;
public class Merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length of array1 ");
        int a=sc.nextInt();
        System.out.print("enter length of array2 ");
        int b=sc.nextInt();
        int arr1[]=new int[a];
        int arr2[]=new int[b];
        int arr3[]=new int[a+b];
        System.out.println("array 1");
        for(int i=0;i<a;i++){
            System.out.print("enter element ");
            arr1[i]=sc.nextInt();
        }
        System.out.println("array 2");
        for(int i=0;i<b;i++){
            System.out.print("enter element ");
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<(b+a);i++){
            if(i<a){
                arr3[i]=arr1[i];
            }
            else{
                arr3[i]=arr2[i-a];
            }
            
        }
        int temp;
        for(int end=1;end<arr3.length;end++ ){
            if(arr3[end]<arr3[end-1]){
                for(int i=end;i>0&&arr3[i]<arr3[i-1];i--){
                    temp=arr3[i];
                    arr3[i]=arr3[i-1];
                    arr3[i-1]=temp;
                }
            }
        }System.out.println("sorted and merged array:");
        for(int i=0;i<(a+b);i++){
            System.out.print(arr3[i]+" ");           
        }
        sc.close();
    }
}
