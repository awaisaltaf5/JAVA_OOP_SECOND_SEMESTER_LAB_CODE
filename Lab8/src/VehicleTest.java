// Define the Vehicle interface
interface Vehicle {
    void start(); // Starts the vehicle
    void stop();  // Stops the vehicle
    void accelerate(double speed); // Accelerates the vehicle by the specified speed
}

// Implement the Vehicle interface in the Car class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }
}

// Implement the Vehicle interface in the Bike class
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Bike is accelerating to " + speed + " km/h.");
    }
}

// Implement the Vehicle interface in the Truck class
class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Truck is accelerating to " + speed + " km/h.");
    }
}

// Main class to test the implementation
public class VehicleTest {
    public static void main(String[] args) {
        // Create instances of Car, Bike, and Truck
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        // Test Car
        System.out.println("Testing Car:");
        car.start();
        car.accelerate(100); // Accelerate car to 100 km/h
        car.stop();

        // Test Bike
        System.out.println("\nTesting Bike:");
        bike.start();
        bike.accelerate(80); // Accelerate bike to 80 km/h
        bike.stop();

        // Test Truck
        System.out.println("\nTesting Truck:");
        truck.start();
        truck.accelerate(60); // Accelerate truck to 60 km/h
        truck.stop();
    }
}
