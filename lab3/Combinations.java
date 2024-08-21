//duplication is allowed
import java.util.Scanner;
public class Combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[4];
        for (int i=0;i<4;i++){
            System.out.println("enter the element");
            arr[i]=in.nextInt();
        }
        System.out.println("all combinations of {"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+"} is:");
        for(int i:arr){
            for(int j:arr){
                for(int k:arr){
                    for(int l:arr){
                        System.out.print("{"+i+" "+j+" "+k+" "+l+"}, ");
                    }
                }
            }
        }
        in.close();
    }
}
