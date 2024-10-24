// Base class named 'parent'
class parent {
    // Method in the parent class that prints a message
    public void displayP() {
        System.out.println("This is Parent class!");  // Prints a message indicating it's the parent class
    }
}

// Derived class 'child' that extends the 'parent' class
// Inherits the methods and properties from the 'parent' class
class child extends parent {
    // Method specific to the child class that prints a message
    public void displayC() {
        System.out.println("This is Child class!");  // Prints a message indicating it's the child class
    }
}

// Main class to demonstrate inheritance in Java
public class Tut1_Inheritence {
    public static void main(String[] args) {
        // Creating an instance of the child class
        child c1 = new child();

        // Call the method from the parent class using the child object
        c1.displayP();  // This will invoke the 'displayP' method from the parent class

        // Call the method from the child class
        c1.displayC();  // This will invoke the 'displayC' method from the child class
    }
}
