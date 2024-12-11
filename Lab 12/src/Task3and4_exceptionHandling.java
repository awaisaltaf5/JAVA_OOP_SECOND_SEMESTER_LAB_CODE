import java.util.Scanner;

// Custom exception for age out of range
class AgeOutofRangeException extends Exception {
    public AgeOutofRangeException() {
        super("Your age is greater than 25. You cannot apply for the job.");
    }
}

// Custom exception for low GPA
class Low_GpaException extends Exception {
    public Low_GpaException() {
        super("Your GPA is less than 2.5. You cannot apply for the job.");
    }
}

public class Task3and4_exceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's age and GPA
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        try {
            // Nested try-catch for age validation
            try {
                if (age > 25) {
                    throw new AgeOutOfRangeException();  // Throw if age > 25
                }
            } catch (AgeOutOfRangeException e) {
                System.out.println(e.getMessage());  // Handle AgeOutOfRangeException
                return;  // Exit if age is invalid
            }

            // Nested try-catch for GPA validation
            try {
                if (gpa < 2.5) {
                    throw new LowGpaException();  // Throw if GPA < 2.5
                }
            } catch (LowGpaException e) {
                System.out.println(e.getMessage());  // Handle LowGpaException
                return;  // Exit if GPA is invalid
            }

            // If both age and GPA are valid
            System.out.println("Your application is accepted and is under study.");

            // Demonstrating RuntimeExceptions

            // Example 1: ArithmeticException (divide by zero)
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Runtime Exception (ArithmeticException): " + e.getMessage());
            }

            // Example 2: ArrayIndexOutOfBoundsException (accessing invalid index)
            try {
                int[] arr = new int[3];
                arr[5] = 10;  // This will throw an exception
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Runtime Exception (ArrayIndexOutOfBoundsException): " + e.getMessage());
            }

            // Example 3: NullPointerException (accessing null object)
            try {
                String str = null;
                str.length();  // This will throw a NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Runtime Exception (NullPointerException): " + e.getMessage());
            }

        } finally {
            scanner.close();  // Always close the scanner
        }
    }
}
