import java.util.Scanner;
public class Patternfor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the limit");
        int n=in.nextInt();
        for(int i=1;i<(n+1);i++){
            for (int j=1;j<(i+1);j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
