// Base class electronicDevice
class electronicDevice {
    // Attributes for brand and model
    String brand;
    String model;

    // Constructor to initialize brand and model
    public electronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Method to simulate turning the device on
    public void turnOn() {
        System.out.println("Turning on...");
    }

    // Method to simulate turning the device off
    public void turnOf() {
        System.out.println("Turning off...");
    }

    // Method to display details of the electronic device
    public void showDetail() {
        System.out.println("Laptop Brand: " + brand + "\nLaptop Model: " + model);
    }
}

// Derived class laptop that extends electronicDevice
class laptop extends electronicDevice {
    // Additional attributes for laptop
    String operatingSystem;
    double screenSize;

    // Constructor that initializes brand, model, operating system, and screen size
    public laptop(String brand, String model, String operatingSystem, double screenSize) {
        super(brand, model); // Call to the superclass constructor to initialize brand and model
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    // Overriding the showDetail method to add laptop-specific details
    @Override
    public void showDetail() {
        super.showDetail(); // Call to the superclass method to show brand and model
        System.out.println("Operating System: " + operatingSystem + " Screen Size: " + screenSize);
    }
}

// Main class to demonstrate inheritance and method overriding
public class Task3_Inheritance_Laptop {
    public static void main(String[] args) {
        // Create an instance of the laptop class
        laptop l = new laptop("HP", "X2R456", "\nWindows 11", 345.0);

        // Call the inherited and overridden methods
        l.turnOn();           // Calls the method from the electronicDevice class
        l.showDetail();       // Calls the overridden method from the laptop class
        l.turnOf();           // Calls the method from the electronicDevice class
    }
}
