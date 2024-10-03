package Lab3.src;
import java.util.Scanner;
public class Task4_car {
     String carName,carColour,carCompany;
     int carModel;
    public void carName(String n){
        carName=n;
    }
    public void carColour(String c){
        carColour=c;
    }
    public void carModel(int m){
        carModel=m;
    }
    public void carCompnay(String c){
        carCompany=c;

    }
    public void display(){
        System.out.println("Your car Name:"+carName+"\nCar Colour:"+carColour+"\nCar Model:"+carModel+"\nCar Company:"+carCompany);
    }



    public static void main(String[] args) {

        Task4_car car1=new Task4_car();
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Car Name:");
        car1.carName(input.nextLine());
        //String name=input.nextLine;
        //car1.carName(name);



        System.out.print("Enter the Car Colour:");
        car1.carColour(input.nextLine());

        System.out.print("Enter the Car Model:");
        car1.carModel(input.nextInt());
        // Clear the newline character left by nextInt()
        input.nextLine();// This is the essential addition

        System.out.print("Enter the Car Company: ");
        car1.carCompnay(input.nextLine());


        car1.display();

        input.close();//I use this to close the Scanner resource
    }
}
