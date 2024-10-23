import java.util.Scanner;
class MatrixVal extends Exception{
    public String toString(){
        return "not square matrix";
    }
}
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter m: ");
        int m=sc.nextInt();
        System.out.println("enter n: ");
        int n=sc.nextInt();
        if(m==n){
            System.out.println("its square matrix");
        }
        else{
            throw new MatrixVal();
        }}
        catch(MatrixVal e){
            System.out.println(e);
        }
       sc.close();
    }
}
