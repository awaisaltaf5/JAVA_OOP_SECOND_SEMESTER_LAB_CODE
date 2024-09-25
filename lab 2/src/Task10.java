import java.util.Scanner;
class Rectangle{
    double length;  double width;
      public double Area(double a,double b){
        length=a;
        width=b;

        return length*width;

      }

}
public class Task10{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Rectangle rectangle=new Rectangle();
        System.out.println("Enter the Length");
        double a=input.nextInt();
        System.out.println("Enter the width");
        double b=input.nextInt();
        double area=rectangle.Area(a,b);
        System.out.println("The area of rectangle is: "+area);
    }


}

