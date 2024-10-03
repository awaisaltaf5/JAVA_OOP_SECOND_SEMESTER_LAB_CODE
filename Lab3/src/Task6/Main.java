package Lab3.src.Task6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("Enter the Car details");
        Scanner input = new Scanner(System.in);
        System.out.print("\nCar Name: ");
        String name = input.nextLine();
        System.out.print("Car Owner:");
        String owner =input.nextLine();
        System.out.print("Car Model:");
        String model=input.nextLine();
        System.out.print("Car Price:");
        double price=input.nextDouble();
        input.nextLine();
        car car1 = new car();
        car1.carData(name,owner,model,price);
        car1.display();

        //car car2=new car();
        //car car3=new car();
        input.close();


    }
}
