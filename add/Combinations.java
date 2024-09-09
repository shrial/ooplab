import java.util.Scanner;
public class Combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[4];
        for (int i=0;i<4;i++){
            System.out.println("enter the element");
            arr[i]=in.nextInt();
        }
        //duplication is allowed
        System.out.println("all combinations of {"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+"} with duplication is:");
        for(int i:arr){
            for(int j:arr){
                for(int k:arr){
                    for(int l:arr){
                        System.out.print("{"+i+" "+j+" "+k+" "+l+"}, ");
                    }
                }
            }
        }
        //duplication isnt allowed
        System.out.println("");
        System.out.println("all combinations of {"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+"} without duplication is:");
        for(int i:arr){
            for(int j:arr){
                if(j==i){
                    continue;
                }
                for(int k:arr){
                    if (k==i || k==j){
                        continue;
                    }
                    for(int l:arr){
                        if(l==i|| l==j || l==k){
                            continue;
                        }
                        System.out.print("{"+i+" "+j+" "+k+" "+l+"}, ");
                    }
                }
            }
        }
        in.close();
    }
}
