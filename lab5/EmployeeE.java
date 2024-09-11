import java.util.Scanner;
class Employee{
    String name,city;
    double salary,da,hra;
    void getdata(Scanner sc){
        System.out.print("enter name ");
        name=sc.nextLine();
        System.out.print("enter city ");
        city=sc.nextLine();
        System.out.print("enter salary ");
        salary=sc.nextDouble();
        System.out.print("enter dearness allowance ");
        da=sc.nextDouble();
        System.out.print("enter house rent ");
        hra=sc.nextDouble();
    }
    double calculate(){
        return salary+salary*da/100+salary*hra/100;
    }
    void display(double t){
        System.out.println("name,city,salary,da,hra and total salary are: "+name+","+city+","+salary+","+da+","+hra+","+t);
    }
}
public class EmployeeE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        e.getdata(sc);
        double t=e.calculate();
        e.display(t);
    }
    
}
