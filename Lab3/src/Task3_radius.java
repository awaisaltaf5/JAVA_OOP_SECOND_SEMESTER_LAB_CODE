package Lab3.src;
import java.util.Scanner;

public class Task3_radius {
    float radius;
    final float pi= 3.14F;
    float result;

     public Task3_radius(float r){
         result=2*pi*r;
     }
     public Task3_radius() {
         System.out.println("So given below is the Circumference");
     }
     public void display(){
         System.out.println("Circumference:"+result);
     }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Radius:");
         float radius =input.nextFloat();
        Task3_radius circum=new Task3_radius(radius);
        Task3_radius show=new Task3_radius();
        //show.display();
        circum.display();
    }



}
