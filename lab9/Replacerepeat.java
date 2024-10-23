//its working
import java.util.Scanner;
public class Replacerepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        StringBuffer b=new StringBuffer(sc.nextLine());
        StringBuffer s=new StringBuffer();
        for(int i=0;i<(b.length()-1);i++){
            if(b.substring(i+1).contains(String.valueOf(b.charAt(i)))){
                if(s.indexOf(String.valueOf(b.charAt(i)))==-1)
                s.append(b.charAt(i));
            }
        }
        String f=s.toString();
        System.out.println("final string: "+f);
        sc.close();
    }
}
