// Class to handle string-related operations
class StringUtils {

    // Method to concatenate and display a single string
    public void concatenatingStrings(String a) {
        System.out.println(a); // Simply prints the single string provided
    }

    // Overloaded method to concatenate and display two strings and an integer
    public void concatenatingStrings(String a, String b, int c) {
        System.out.println(a + b + c); // Concatenates two strings and an integer
    }

    // Overloaded method to concatenate and display two strings
    public void concatenatingStrings(String a, String b) {
        System.out.println(a + b); // Concatenates two strings
    }
}

// Main class to test the StringUtils class
public class Task5_StringUtils {
    public static void main(String[] args) {
        // Create an instance of StringUtils
        StringUtils s = new StringUtils();

        // Call the method that takes a single string
        s.concatenatingStrings("Hello! I am Muhammad Awais ALtaf");

        // Call the method that takes two strings and an integer
        s.concatenatingStrings("This is", " Java Version ", 21);

        // Call the method that takes two strings
        s.concatenatingStrings("Executing the", " Program!");
    }
}
