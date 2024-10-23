import java.util.Scanner;

class ArrayOverflowException extends Exception{
    public String toString(){
        return "Exceeding size limit!";
    }
}
public class Array {
    static int top=-1;
    static void add(int v,int arr[]){
        arr[++top]=v;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean b=true;
        while(b){
            if(top<(n-1)){
            System.out.println("enter element ");
            add(sc.nextInt(),arr);}
            else throw new ArrayOverflowException();
            sc.nextLine();
            System.out.println("continue? ");
            b=sc.nextBoolean();
        }
        }
        catch(ArrayOverflowException e){
            System.out.println(e);
        }
        sc.close();
    }
}
