//working
import java.util.Scanner;
public class Displaychar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a multiline string (type 'END' to end)");
        StringBuilder inp = new StringBuilder();
        String line;
        while (!(line = sc.nextLine()).equals("END")) {
            inp.append(line).append("\n");
        }
        String input = inp.toString();
        int strc=0,strw=0,strl=0,strv=0;
        strc = input.length();
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                strv++;
            }
            else if(c==' '){
                strw++;
            }
            else if(c=='\n'){
                strl++;
                strw++;
            }
        }
        System.out.println("Number of characters: " +strc);
        System.out.println("Number of words: " + strw);
        System.out.println("Number of lines: " + strl);
        System.out.println("Number of vowels: " +strv);
        sc.close();
    }
}


   
