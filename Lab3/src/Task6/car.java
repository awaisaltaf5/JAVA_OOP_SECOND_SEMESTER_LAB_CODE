package Lab3.src.Task6;
//import java.util.Scanner;
public class car {
    String carName,carOwner,carModel;
    double carPrice;
    public void carData(String name,String owner,String model,double price){
        this.carName=name;
        this.carOwner=owner;
        this.carModel=model;
        this.carPrice=price;

    }
    public void display(){
        System.out.println("\n\n\nYour Car Details:");
        System.out.println("Car name:"+carName+"\nCar Owner:"+carOwner+"\nCar Model:"+carModel+"\nCar Price:"+carPrice);
    }
}
