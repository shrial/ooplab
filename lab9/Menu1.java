//working
import java.util.Scanner;
class Menu{
    String s;
    String r;
    Menu(){}
    Menu(String s){
        this.s=s;
        r=new StringBuffer(s).reverse().toString();
    }
    void isPalindrome(){
        if(s.equals(r)){
            System.out.println(s+" is palindrome");
        }
        else{
            System.out.println(s+" is not palindrome");
        }
    }
    void sort(){
        char arr[]=s.toCharArray();
        for(int i=1;i<s.length();i++){
            for(int j=0;j<(s.length()-1);j++){
                if(arr[j]>arr[j+1]){
                    char a=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;
                }
            }
        }
        System.out.println("sorted string: "+new String(arr));
    }
}
public class Menu1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        while(b){
        System.out.println("enter string");
        String s=sc.nextLine();
        System.out.println("1.check palindrome 2.alphabetical order 3.reverse 4.concatenate with reverse");
        int ch=sc.nextInt();
        Menu m=new Menu(s);
        switch(ch){
            case 1:{
                m.isPalindrome();
                break;
            }
            case 2:{
                m.sort();
                break;
            }
            case 3:{
                System.out.println("reversed string is "+m.r);
                break;
            }
            case 4:{
                System.out.println("concatenated string: "+s.concat(m.r));
                break;
            }
        }
        System.out.println("do you want to continue");
        b=sc.nextBoolean();
        sc.nextLine();
    }
        sc.close();
    }
}
