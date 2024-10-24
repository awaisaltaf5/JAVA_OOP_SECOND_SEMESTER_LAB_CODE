// Base class specie
class specie {
    // Method to describe the movement of the species
    public void move() {
        System.out.println("The animal is running");
    }
}

// Derived class cheeta that extends specie
class cheeta extends specie {
    // Overriding the move method to provide a specific behavior for the cheeta
    @Override
    public void move() {
        System.out.println("The Cheeta is running");
    }
}

// Main class to demonstrate inheritance and method overriding
public class Task3_Part2_Inheritence_Animal {
    public static void main(String[] args) {
        // Create an instance of the base class specie
        specie A = new specie();

        // Create an instance of the derived class cheeta
        cheeta c = new cheeta();

        // Call the move method on the base class instance
        A.move();  // Output: "The animal is running"

        // Call the move method on the cheeta class instance (method overriding in action)
        c.move();  // Output: "The Cheeta is running"
    }
}
