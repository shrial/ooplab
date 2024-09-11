import java.util.Scanner;
class Complex{
    int inte;
    double comp;
    Complex(){}
    Complex(int i,double c){
        inte=i;
        comp=c;
    }
    static void add(int i, Complex co){
        int integer= i+co.inte;
        System.out.println("sum is: "+integer+" + "+co.comp+"i");
    }
    static void add(Complex co1, Complex co2){
        int comp1= co1.inte+co2.inte;
        double comp2= co1.comp+co2.comp;
        System.out.println("sum is: "+comp1+" + "+comp2+"i");
    }  
}
public class ComplexE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("integer part");
        System.out.print("first complex number: ");
        int inte1=in.nextInt();
        System.out.print("second complex number: ");
        int inte2=in.nextInt();
        System.out.println("complex part");
        System.out.print("first complex number: ");
        double comp1=in.nextDouble();
        System.out.print("second complex number: ");
        double comp2=in.nextDouble();
        Complex co1= new Complex(inte1,comp1);
        Complex co2= new Complex(inte2,comp2);
        System.out.print("enter an integer");
        int i=in.nextInt();
        Complex.add(i,co1);
        Complex.add(co1,co2);
        in.close();
    }
    
}
