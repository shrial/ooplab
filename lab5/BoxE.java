
import java.util.Scanner;
class Box{
    double width;
    double height;
    double depth;
    Box(){}
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}
public class BoxE{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter width ");
        double w=in.nextDouble();
        System.out.print("enter height ");
        double h=in.nextDouble();
        System.out.print("enter depth ");
        double d=in.nextDouble();
        Box b=new Box(w,h,d);
        System.out.println("volume is: "+b.volume());
        in.close();
    }
}