//working
import java.util.Scanner;
class Menuu{
    String s;
    Menuu(){}
    Menuu(String s){
        this.s=s;
    }
    void change(){
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                arr[i]=Character.toLowerCase(s.charAt(i));
            }
            else{
                arr[i]=Character.toUpperCase(s.charAt(i));
            }
        }
        s=new String(arr);
    }
   
}
public class Menu2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        System.out.println("1.compare string 2.change case 3.string is substring? 4.replace substring with hello");
        while(b){
        System.out.println("enter string");
        String s=sc.nextLine();
        System.out.println("enter choice");
        int ch=sc.nextInt();
        sc.nextLine();
        Menuu m=new Menuu(s);
        switch(ch){
            case 1:{
                System.out.println("enter second string");
                String s2=sc.nextLine();
                int a=s.compareTo(s2);
                if(a>0){
                    System.out.println(s2+" comes before "+s);
                }
                else if(a<0){
                    System.out.println(s2+" comes after "+s);
                }
                else{
                    System.out.println("both are equal");
                }
                break;
            }
            case 2:{
                m.change();
                System.out.println("string with case inverted: "+m.s);
                break;
            }
            case 3:{
                System.out.println("enter second string");
                String s2=sc.nextLine();
                if(s.contains(s2)){
                    System.out.println("the entered string is a subtring");
                }
                else{
                    System.out.println("entered string is not substring");
                }
                break;
            }
            case 4:{
                System.out.println("enter second string");
                String s2=sc.nextLine();
                if(s.contains(s2)){
                    s=s.replace(s2, "Hello");
                }
                System.out.println("updated string: "+s);
                break;
            }
        }
        System.out.println("continue?");
        b=sc.nextBoolean();
        sc.nextLine();
    }
        sc.close();
    }
}
