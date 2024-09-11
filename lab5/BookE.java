// 6.	Write a program to define a class called Book with title,author and edition fields.  Define suitable constructors for the Book class. Create a list of 6 Book objects in ascending order.  Display only those books’ details written by an author taken as an user input.
import java.util.Scanner;
class Book{
    String title,author;
    int edition;
    Book(){}
    Book(String t,String a, int e){
        title=t;
        author=a;
        edition=e;
    }
    void display(){
        System.out.println(title+","+author+","+edition);
    }
}
public class BookE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book b[]=new Book[6];
        for(int i=0;i<6;i++){
            b[i]=new Book();
            System.out.print("enter title ");
            b[i].title=sc.nextLine();
            System.out.print("enter author ");
            b[i].author=sc.nextLine();
            System.out.print("enter edition ");
            b[i].edition=sc.nextInt();  
            sc.nextLine();        
        }
        System.out.print("enter author name");
        String an=sc.nextLine();
        for(Book i:b){
            if(an.equalsIgnoreCase(i.author)){
                i.display();
            }
        }

        sc.close();
    }
}
