//write code to display the details
import java.util.Scanner;
class Student{
    int regno,age;
    String name;
    Student(){}
    Student(int r,String n,int a){
        regno=r;
        name=n;
        age=a;
    }
    Student (Student s){
        regno=s.regno;
        name=s.name;
        age=s.age;
    }
    void disp(){
        System.out.println("name,registration number,age is: "+name+","+regno+","+age);
    }

}
class Ug extends Student{
    int sem;
    int fees;
    static int count=0;
    Ug(){}
    Ug(int s, int f,Student a){
        super(a);
        sem=s;
        fees=f;
        count++;
    }
    void disp(){
        super.disp();
        System.out.println("semester,fees is: "+sem+","+fees);
    }
}
class Pg extends Student{
    int sem;
    int fees;
    static int count=0;
    Pg(){}
    Pg(int s, int f,Student a){
        super(a);
        sem=s;
        fees=f;
        count++;
    }
    void disp(){
        super.disp();
        System.out.println("semester,fees is: "+sem+","+fees);
    }
}
public class Stud {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char r='y',t;int i=0,j=0;
        Ug u[]=new Ug[10];
        Pg p[]=new Pg[10];
        while(r=='y'){
            System.out.print("new student u/p ");
            t=sc.next().charAt(0);
            if(t=='u'){
                System.out.print("enter name ");
                String n=sc.nextLine();
                sc.nextLine();
                System.out.print("enter registration number ");
                int reg=sc.nextInt();
                System.out.print("enter age ");
                int age=sc.nextInt();
                System.out.print("enter semester ");
                int sem=sc.nextInt();
                System.out.print("enter fees ");
                int f=sc.nextInt();
                sc.nextLine(); 
                Student s=new Student(reg,n,age);
                u[i]=new Ug(sem,f,s);
                i++;
                
            }
            else if(t=='p'){
                System.out.print("enter name");
                String n=sc.nextLine();
                sc.nextLine();
                System.out.print("enter registration number");
                int reg=sc.nextInt();
                System.out.print("enter age");
                int age=sc.nextInt();
                System.out.print("enter semester");
                int sem=sc.nextInt();
                System.out.print("enter fees");
                int f=sc.nextInt();
                sc.nextLine(); 
                Student s=new Student(reg,n,age);
                p[j]=new Pg(sem,f,s);
                j++;
            }

            System.out.print("continue? y/n");
            r=sc.next().charAt(0);
            sc.nextLine();
        }
        System.out.println("number of ug students are: "+Ug.count);
        System.out.println("number of pg students are: "+Pg.count);
        System.out.println("UG: ");
        for(int k=0;k<Ug.count;k++){
            u[k].disp();
        }
        System.out.println("PG: ");
        for(int k=0;k<Pg.count;k++){
            p[k].disp();
        }
        sc.close();
    }
}
