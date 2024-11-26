abstract class Shape {
    abstract void draw();
    public void display() {
        System.out.println("This is Abstract Class");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle is Drawing!!");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle is Drawing!!");
    }
}

public class Task1_abstract {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();  // Create instance of Rectangle
        r.draw();  // Calls Rectangle's draw method

        Circle c = new Circle();  // Create instance of Circle
        c.draw();  // Calls Circle's draw method
        c.display();
    }
}
