// Define the Car interface
interface car {
    void start(); // Starts the car engine
    void stop();  // Stops the car engine
    void displayDetails(); // Displays details about the car
}

// Concrete class for SedanCar
class SedanCar implements car {
    public void start() {
        System.out.println("SedanCar engine started.");
    }

    public void stop() {
        System.out.println("SedanCar engine stopped.");
    }

    public void displayDetails() {
        System.out.println("SedanCar: A comfortable car for city and long drives.");
    }
}

// Concrete class for SUVCar
class SUVCar implements car {
    public void start() {
        System.out.println("SUVCar engine started.");
    }

    public void stop() {
        System.out.println("SUVCar engine stopped.");
    }

    public void displayDetails() {
        System.out.println("SUVCar: A powerful car for off-road and family trips.");
    }
}

// Concrete class for ElectricCar
class ElectricCar implements car {
    public void start() {
        System.out.println("ElectricCar engine started silently.");
    }

    public void stop() {
        System.out.println("ElectricCar engine stopped.");
    }

    public void displayDetails() {
        System.out.println("ElectricCar: An eco-friendly car with zero emissions.");
    }
}

// Main class to test the implementation
public class CarManufacturing {
    public static void main(String[] args) {
        // Create objects of each car type
        car sedan = new SedanCar();
        car suv = new SUVCar();
        car electric = new ElectricCar();

        // Test each car
        System.out.println("Testing SedanCar:");
        sedan.start();
        sedan.displayDetails();
        sedan.stop();

        System.out.println("\nTesting SUVCar:");
        suv.start();
        suv.displayDetails();
        suv.stop();

        System.out.println("\nTesting ElectricCar:");
        electric.start();
        electric.displayDetails();
        electric.stop();
    }
}
