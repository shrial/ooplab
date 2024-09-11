import java.util.Scanner;
class Student_Detail{
    String name;
    int id;
    static String college_name="MIT";
    Student_Detail(String s,int id){
        this.id=id;
        name=s;
    }
    void display_details(){
        System.out.println("College: "+college_name);
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

public class StudentE{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name and id:");
        Student_Detail s1=new Student_Detail(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the name and id:");
        Student_Detail s2=new Student_Detail(sc.nextLine(), sc.nextInt());
        s1.display_details();
        s2.display_details();     
        sc.close();   
    }
}