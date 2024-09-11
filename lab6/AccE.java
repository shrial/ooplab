import java.util.Scanner;
class Account{
    String name;
    int accno;
    char type;
    Account(){}
    Account(String n, int acc,char t){
        name=n;
        accno=acc;
        type=t;
    }
    Account(Account a){
        name=a.name;
        accno=a.accno;
        type=a.type;
    }
}
class CurrentAccount extends Account{
    float balc;
    final float MINBAL=1000;
    CurrentAccount(){}
    CurrentAccount(float b,Account a){
        super(a);
        balc=b;
    }
    void updateBal(Scanner sc){
        //Scanner sc=new Scanner(System.in);
        System.out.print("enter deposit ");
        float dep=sc.nextFloat();
        balc+=dep;
       // sc.close();
    }
    void display(){
        System.out.println("balance is: "+balc);
    }
    void withdraw(Scanner sc){
        //Scanner sc=new Scanner(System.in);
        System.out.print("enter amount to be withdrawn ");
        float wd=sc.nextFloat();
        balc-=wd;
        
        //sc.close();
    }
    void check(){
        if (balc<MINBAL){
            balc-=500;
            System.out.println("balance less than minimum");
        }
        
    }
}
class SavingsAccount extends Account{
    float bals;
    float interest;
    SavingsAccount(){}
    SavingsAccount(float b,Account a){
        super(a);
        bals=b;
    }
    void updateBal(Scanner sc){
        //Scanner sc=new Scanner(System.in);
        System.out.print("enter deposit ");
        float dep=sc.nextFloat();
        bals+=dep;
        //sc.close();
    }
    void display(){
        System.out.println("balance is: "+bals);
    }
    void compute(int t){
        interest=(bals*t*2)/10000;
        bals+=interest;
    }
    void withdraw(Scanner sc){
       // Scanner sc=new Scanner(System.in);
        System.out.print("enter amount to be withdrawn ");
        float wd=sc.nextFloat();
        bals-=wd;
        //sc.close();
    }
}
public class AccE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name ");
        String name=sc.nextLine();
        System.out.print("enter account number ");
        int no=sc.nextInt();
        System.out.print("enter account type(c/s) ");
        char type=sc.next().charAt(0);
        Account a=new Account(name,no,type);
        if(a.type=='c'){
            CurrentAccount c=new CurrentAccount(0,a);
            c.updateBal(sc);
            c.display();
            c.withdraw(sc);
            c.display();
            c.check();
        }
        else if(a.type=='s'){
            SavingsAccount s=new SavingsAccount(0,a);
            s.updateBal(sc);
            s.display();
            System.out.print("enter time period ");
            if(sc.hasNextInt()){
            int t=sc.nextInt();
            s.compute(t);}
            s.display();
            s.withdraw(sc);
            s.display();
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
    
}
