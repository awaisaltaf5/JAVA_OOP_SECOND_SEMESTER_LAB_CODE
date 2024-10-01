package Lab3.src;
import java.util.Scanner;

public class Task1_Marks {
    int math, english, physics;
    int result;

    // Constructor to initialize the marks
    public Task1_Marks(int m1, int m2, int m3) {
        math = m1;
        english = m2;
        physics = m3;
        result = math + english + physics;
    }

    // Constructor to calculate the sum
    public Task1_Marks() {
        //result = math + english + physics;
        System.out.println("Muhammad Awais ALtaf");
    }

    // Method to display the sum
    public void display() {
        System.out.println("The sum of the three marks is: " + result);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Maths Marks:");
        int m=input.nextInt();
        System.out.println("Enter the English Marks:");
        int e=input.nextInt();
        System.out.println("Enter the Physics  Marks:");
        int p=input.nextInt();
        // Initialize marks using the first constructor
        Task1_Marks marks = new Task1_Marks(m,e,p);


        Task1_Marks sumResult = new Task1_Marks();

        // Display the sum
        marks.display();
    }
}
