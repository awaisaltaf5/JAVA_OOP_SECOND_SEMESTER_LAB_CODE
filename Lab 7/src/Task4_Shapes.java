// Base class Shape
class Shape {
    // Method to "draw" a shape, will be overridden in derived classes
    public void draw() {
        System.out.println("Shapes are Drawing!");
    }

    // Method to calculate the area of the shape, returns 0 by default
    // This method will be overridden in derived classes
    public double calculateArea() {
        return 0.0;
    }
}

// Derived class Circle, extending Shape
class Circle extends Shape {
    // Attribute specific to Circle
    double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the draw method to show Circle-specific drawing behavior
    public void draw() {
        System.out.println("Drawing the Circle Shape");
    }

    // Override the calculateArea method to calculate the area of the Circle
    @Override
    public double calculateArea() {
        return 3.14 * radius * radius; // Formula: π * r^2
    }
}

// Derived class Square, extending Shape
class Square extends Shape {
    // Attribute specific to Square
    double side;

    // Constructor to initialize the side of the square
    public Square(double side) {
        this.side = side;
    }

    // Override the draw method to show Square-specific drawing behavior
    public void draw() {
        System.out.println("Drawing the shape of Square");
    }

    // Override the calculateArea method to calculate the area of the Square
    @Override
    public double calculateArea() {
        return side * side; // Formula: side^2
    }
}

// Derived class Triangle, extending Shape
class Triangle extends Shape {
    // Attributes specific to Triangle
    double base;
    double height;

    // Constructor to initialize the base and height of the triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override the draw method to show Triangle-specific drawing behavior
    public void draw() {
        System.out.println("Drawing the Triangle Shape");
    }

    // Override the calculateArea method to calculate the area of the Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Formula: 0.5 * base * height
    }
}

// Main class to test the Shape functionality
public class Task4_Shapes {
    public static void main(String[] args) {
        // Creating a Circle object and calculating its area
        Circle c = new Circle(4.07);
        c.draw(); // Calls Circle's draw method
        System.out.println("The Area of Circle is: " + c.calculateArea()); // Calls Circle's calculateArea method

        // Creating a Square object and calculating its area
        Square s = new Square(5.09);
        s.draw(); // Calls Square's draw method
        System.out.println("The Area of Square is: " + s.calculateArea()); // Calls Square's calculateArea method

        // Creating a Triangle object and calculating its area
        Triangle t = new Triangle(3, 6);
        t.draw(); // Calls Triangle's draw method
        System.out.println("The Area of Triangle is: " + t.calculateArea()); // Calls Triangle's calculateArea method
    }
}
