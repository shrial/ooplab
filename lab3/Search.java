import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= in.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];int top=0;
        for(int i=0;i<n;i++){
            System.out.println("enter element");
            int ele= in.nextInt();
            arr[i]=ele;
        }
        System.out.println("enter the value to be searched");
        int key=in.nextInt();
        int i=0;
        for(int j:arr){
            if (j==key){
                arr1[top++]=i;
            }
            i++;
        }
        if (top!=0){
            System.out.print("value found at locations");
        for(int j=0;j<top;j++){
            System.out.print(arr1[j]+" ");
        }}
        else
        System.out.println("value not found in array");
        in.close();
    }
}
