import java.util.Scanner;
public class Addpattern {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the  number of rows");
        int num=in.nextInt();
        int arr[]=new int[num];
        for (int i=1;i<=num;i++){
            arr[i-1]=i;
        }
        int n=1;
        for(int i:arr){
            for(int j:arr){
                if(j<=i){
                    System.out.print(n+" ");
                    n++;
                }
                else{
                    System.out.println("");
                    break;
                }
            }
        }
        in.close();
    }
    
}
