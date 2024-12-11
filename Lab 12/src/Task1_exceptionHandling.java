// Custom exception class
class LowGpa_Exception extends Exception {
    // Constructor
    public LowGpa_Exception() {
        // Call the parent constructor with the custom message
        super("Your GPA is not sufficient to apply for this job (2.5)");
    }
}

public class Task1_exceptionHandling {
    public static void main(String[] args) {
        double gpa = 2.3;  // Example GPA

        try {
            // Check if GPA is sufficient
            if (gpa < 2.5) {
                // Throw custom exception if GPA is too low
                throw new LowGpaException();
            } else {
                System.out.println("Your GPA is enough to apply for this job.");
            }
        } catch (LowGpaException e) {
            // Catch the exception and print the message
            System.out.println(e.getMessage());
        }
    }
}
