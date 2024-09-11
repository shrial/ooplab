//not working

/*create a system where students can enroll in courses.Each student can only enroll in a limited number of courses.If a student tries to enroll in more than the allowed number of courses a custom exception CourseLimitExceededException should throw error message: Error: cannot enroll in more
 than (lim) courses
1. Student{String studentname,Course[] course} 
2. Course{String coursename}
3. CourseLimitExceededException{int limit}
4. public void enrollincourse(Course course)-> method to enroll student in cours. should not handle exception in the method  
5. declare a data member to store maximum number of courses a student can be enrolled to*/

//so u can create like if u have a data member which is static then u dont need object na so u can initialize the datamember witout assignment 
//like say class student has institute as static data member then u can do new Student("mit")[assuming u have appropriate constructor] 
//syso(Student.institute) will give output mit
import java.util.Scanner;
class CourseLimitExceededException extends Exception{
    static int lim;
    public CourseLimitExceededException(int l){
        lim=l;
    }
    public String toString(){
        return "cannot enroll in more than "+lim+" courses";
    }
}
class Course{
    String c;
    Course(){}
    Course(String co){
        c=co;
    }
    public String toString(){
        return "course is: "+c;
    }
}
class Stud{
    String name;
    Course co[]=new Course[max];
    static int max;
    int coursecount;
    Stud(){}
    Stud(String n){
        name=n;
    }
    public void enroll(Course course) throws CourseLimitExceededException{
        if(coursecount==max){
            throw new CourseLimitExceededException(max);
        }
        else{
            co[coursecount++]=course;
            
        }
    }
}
public class Except {
    public static void main(String[] args) {
        boolean resp=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        Stud.max=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of student");
        String name=sc.nextLine();
        Stud s=new Stud(name);
        while(resp){
            try{
                System.out.println("enter course");
                String course=sc.nextLine();
                sc.nextLine();
                Course c=new Course(course);
                s.enroll(c);

            }
            catch(CourseLimitExceededException e){
                System.out.println(e);
            }
            //before when finally was not there the statements in finally were in try after enroll and it was stuck in loop of asking enter course after saying the error cd u explain the control of the program
            finally{
                System.out.println("do u want to continue");
                resp=sc.nextBoolean();
            }
            

        }
        System.out.println(s.coursecount);
        System.out.println("courses are: ");
            for(int i=0;i<s.coursecount;i++){
                System.out.println(s.co[i]);
            }

        sc.close();
    }
}
