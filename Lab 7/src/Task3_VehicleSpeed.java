// Base class Vehicle
class Vehicle {
    // Speed attribute common to all vehicles
    int speed = 0;

    // Method to be overridden in child classes, used to "speed up" vehicles
    public void speedup() {
        System.out.println("Speeds of Vehicles");
    }

    // Method to display the current speed of the vehicle
    public void Display() {
        System.out.println("Current speed: " + speed + " Km/h");
    }
}

// Derived class Car, inheriting from Vehicle
class Car extends Vehicle {
    // Override the speedup method to provide specific behavior for Car
    public void speedup() {
        speed = speed + 120; // Car increases speed by 120 Km/h
        System.out.println("Speed of Car is Km/h");
    }
}

// Derived class Bicycle, inheriting from Vehicle
class Bicycle extends Vehicle {
    // Override the speedup method to provide specific behavior for Bicycle
    public void speedup() {
        speed = speed + 35; // Bicycle increases speed by 35 Km/h
        System.out.println("Speed Of Bicycle is Km/h");
    }
}

// Main class to test Vehicle speed functionality
public class Task3_VehicleSpeed {
    public static void main(String[] args) {
        // Creating an object of Car and calling its methods
        Car car = new Car();
        car.speedup(); // Increase the speed of the car
        car.Display(); // Display the car's current speed

        // Creating an object of Bicycle and calling its methods
        Bicycle bicycle = new Bicycle();
        bicycle.speedup(); // Increase the speed of the bicycle
        bicycle.Display(); // Display the bicycle's current speed
    }
}
