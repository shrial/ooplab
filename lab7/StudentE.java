import java.util.Scanner;
class Student_Detail{
    String name;
    int id;
    final String COLLEGE_NAME="MIT";
    Student_Detail(String s,int id){
        this.id=id;
        name=s;
    }
    void display_details(){
        System.out.println("College: "+COLLEGE_NAME);
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

public class StudentE{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        sc.nextLine();
        Student_Detail st[]=new Student_Detail[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name");
            String s=sc.nextLine();
            System.out.println("Enter the id");
            int d=sc.nextInt();
            sc.nextLine();
            Student_Detail t=new Student_Detail(s, d);
            st[i]=t;
        }
        for(int i=0;i<n;i++){
            st[i].display_details();
        }    
        sc.close();   
    }
}