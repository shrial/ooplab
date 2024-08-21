import java.util.Scanner;
public class Number{
public static void main(String args[]){
int pos=0,neg=0,zero=0;
Scanner in=new Scanner(System.in);
for(int i=0;i<10;i++){
System.out.println("enter a number");
int inp= in.nextInt();
if (inp>0)
pos+=1;
else if (inp<0)
neg+=1;
else
zero+=1;
}
System.out.println(" number of positive numbers are "+pos+" negative numbers are "+neg+ " and number of zeros are "+zero);}}
