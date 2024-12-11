import java.util.Scanner;

// Custom exception for age out of range
class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException() {
        super("Your age is greater than 25. You cannot apply for the job.");
    }
}

// Custom exception for low GPA
class LowGpaException extends Exception {
    public LowGpaException() {
        super("Your GPA is less than 2.5. You cannot apply for the job.");
    }
}

public class Task2_exceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for age and GPA
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        try {
            // Nested try-catch for age
            try {
                if (age > 25) {
                    throw new AgeOutOfRangeException(); // Throw if age > 25
                }
            } catch (AgeOutOfRangeException e) {
                System.out.println(e.getMessage());  // Handle AgeOutOfRangeException
                return;  // Exit program if age is out of range
            }

            // Nested try-catch for GPA
            try {
                if (gpa < 2.5) {
                    throw new LowGpaException();  // Throw if GPA < 2.5
                }
            } catch (LowGpaException e) {
                System.out.println(e.getMessage());  // Handle LowGpaException
                return;  // Exit program if GPA is too low
            }

            // If both age and GPA are valid
            System.out.println("You can apply for the job!");

        } finally {
            scanner.close(); // Close scanner to avoid resource leak
        }
    }
}
