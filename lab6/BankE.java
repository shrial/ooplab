import java.util.Scanner;
class Bank {  
    int getRateOfInterest() {
        return 0; 
    }
    int calculateInterest(int principal, int years) {
        return (principal * getRateOfInterest() * years) / 100;
    }
}


class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 8; 
    }
}


class ICICI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7; 
    }
}


class AXIS extends Bank {
    @Override
    int getRateOfInterest() {
        return 9; 
    }
}

public class BankE {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Bank s = new SBI();
        Bank i = new ICICI();
        Bank a = new AXIS();
        System.out.println("enter principal amount");      
        int prin=sc.nextInt();     
        System.out.println("enter time period");   
        int t=sc.nextInt();

        
        System.out.println("Interest for SBI: " + s.calculateInterest(prin, t));
        System.out.println("Interest for ICICI: " + i.calculateInterest(prin, t));
        System.out.println("Interest for AXIS: " + a.calculateInterest(prin, t));
        sc.close();
    }
}
