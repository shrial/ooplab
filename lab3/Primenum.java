import java.util.Scanner;
public class Primenum {
    public static void main(String[] args) {
        int flag=1;
        Scanner in = new Scanner(System.in);
        System.out.println("enter first limit");
        int n= in.nextInt();
        System.out.println("enter end limit");
        int m=in.nextInt();
        int arr[]=new int[n];
        int top=0;
        for(int i=n;i<=m;i++){
            for(int j=3;j<i;j++){
                if(i==2){
                    arr[top++]=2;
                }
                if(i%2==0){
                    flag=0;
                    break;
                }
                else{
                    if(i%j==0){
                        flag=0;
                        break;
                    }
                }
            }
            if(flag==1&& i!=1){
                arr[top++]=i;
    
            }
            flag=1;
        }
        if(top==0){
            System.out.println("no prime numbers in given range");
        }
        else{
            System.out.println("prime numbers are");
        for(int i=0;i<top;i++){
            System.out.println(arr[i]);
        }}
        in.close();
    }
}
