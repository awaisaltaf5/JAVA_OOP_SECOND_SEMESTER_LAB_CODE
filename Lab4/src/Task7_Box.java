 public class Task7_Box {
    private double width;
    private double height;
    private double depth;

    // Constructor that takes three arguments for width, height, and depth
    public Task7_Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor that initializes all dimensions to zero (no parameters)
    public Task7_Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    // Constructor that creates a cube (single parameter, all sides equal)
    public Task7_Box(double side) {
        width = height = depth = side;
    }

    // Method to calculate and return the volume of the box or cube
    public double volume() {
        return width * height * depth;
    }
}

 class boxTest {
    public static void main(String[] args) {
        // Creating three instances of the Box class
        Task7_Box mybox1 = new Task7_Box(10, 20, 15); // Box with specific dimensions
        Task7_Box mybox2 = new Task7_Box();           // Box with default zero dimensions
        Task7_Box mycube = new Task7_Box(7);          // Cube with side length of 7

        // Calculating and displaying the volume for each box
        System.out.println("Volume of mybox1: " + mybox1.volume());
        System.out.println("Volume of mybox2: " + mybox2.volume());
        System.out.println("Volume of mycube: " + mycube.volume());
    }
}
