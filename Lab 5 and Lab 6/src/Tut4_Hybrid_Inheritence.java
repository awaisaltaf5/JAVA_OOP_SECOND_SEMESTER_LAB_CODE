// Base class 'Animal' (follows Java convention for capitalized class names)
class Animal {
    // Attribute for storing the type of animal
    String type;

    // Method to display the type of animal
    public void displayType() {
        System.out.println("Type: " + type);  // Displays the type (e.g., Dog, Cat)
    }
}

// Derived class 'Dog' extending 'Animal'
// Inherits properties and methods from the 'Animal' class
class Dog extends Animal {
    // Additional attribute specific to Dog class
    String name;

    // Method to display the name of the dog
    public void displayName() {
        System.out.println("Dog Name: " + name);  // Displays the name of the dog (e.g., Bull Dog)
    }
}

// 'Doggy' class extending 'Dog'
// Inherits properties and methods from both 'Animal' and 'Dog' classes
class Doggy extends Dog {
    // Additional attribute specific to 'Doggy' class
    double price;

    // Method to display the price of the dog
    public void displayPrice() {
        System.out.println("Dog Price: " + price);  // Displays the price of the dog (e.g., 20000)
    }
}

// 'Cat' class extending 'Animal'
// Inherits properties and methods from the 'Animal' class
class Cat extends Animal {
    // Additional attribute specific to 'Cat' class
    String name;

    // Method to display the name of the cat
    public void displayName() {
        System.out.println("Cat Name: " + this.name);  // Displays the name of the cat (e.g., Cato)
    }
}

// Main class to demonstrate hybrid inheritance
public class Tut4_Hybrid_Inheritence {
    public static void main(String[] args) {
        // Create an object of 'Doggy' class (inherits from both 'Dog' and 'Animal')
        Doggy d1 = new Doggy();

        // Create an object of 'Cat' class (inherits from 'Animal')
        Cat c1 = new Cat();

        // Setting attributes for the 'Doggy' object
        d1.type = "Dog";  // Set the type inherited from 'Animal'
        d1.name = "Bull Dog";  // Set the name inherited from 'Dog'
        d1.price = 20000;  // Set the price specific to 'Doggy'

        // Setting attributes for the 'Cat' object
        c1.name = "Cato";  // Set the name specific to 'Cat'

        // Displaying the attributes of the 'Doggy' object
        d1.displayType();  // Calls method from 'Animal' class to display type
        d1.displayName();  // Calls method from 'Dog' class to display name
        d1.displayPrice();  // Calls method from 'Doggy' class to display price

        // Displaying the attributes of the 'Cat' object
        c1.displayName();  // Calls method from 'Cat' class to display name
    }
}
