import java.util.Scanner;  // Import the Scanner class to take input from the user

// BookV2 class encapsulating book details and providing methods for comparison
class BookV2 {
    // Private data members for encapsulation
    private String author;                     // Stores the author of the book
    private String[] chapterName = new String[100];  // Array to hold up to 100 chapter names

    // No-argument constructor
    // Initializes 'author' to an empty string, representing no author assigned yet
    public BookV2() {
        this.author = "";
    }

    // Constructor with parameters
    // Allows the initialization of the 'author' and 'chapterName' directly when creating a BookV2 object
    public BookV2(String author, String[] chapterName) {
        this.author = author;               // Sets the author for the book
        this.chapterName = chapterName;     // Sets the chapters for the book
    }

    // Getter method for the 'author' field
    // Provides read access to the private field 'author'
    public String getAuthor() {
        return author;
    }

    // Setter method for the 'author' field
    // Provides write access to the private field 'author', allowing changes to the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for the 'chapterName' array
    // Provides access to retrieve the list of chapter names
    public String[] getChapterName() {
        return chapterName;
    }

    // Setter method for the 'chapterName' array
    // Allows setting the list of chapter names for the book
    public void setChapterName(String[] chapterName) {
        this.chapterName = chapterName;
    }

    // Static method to compare authors of two BookV2 objects
    // Returns true if the authors are the same, otherwise returns false
    public static boolean compareBooks(BookV2 book1, BookV2 book2) {
        return book1.getAuthor().equals(book2.getAuthor());  // Compares the authors using the equals() method
    }

    // Static method to compare the number of chapters in two books
    // Returns the book with more chapters or the first book if they have the same number of chapters
    public static BookV2 compareChapterNames(BookV2 book1, BookV2 book2) {
        // Count chapters in both books
        int chapters1 = countChapters(book1.getChapterName());  // Count valid chapters in book1
        int chapters2 = countChapters(book2.getChapterName());  // Count valid chapters in book2

        // Return the book with more chapters, or book1 if both have the same number of chapters
        if (chapters1 >= chapters2) {
            return book1;
        } else {
            return book2;
        }
    }

    // Helper method to count the non-null, non-empty chapters
    // It iterates through the chapter array and counts how many chapters have content
    private static int countChapters(String[] chapters) {
        int count = 0;  // Initialize count to 0
        for (String chapter : chapters) {  // Iterate through the chapter array
            if (chapter != null && !chapter.isEmpty()) {  // Check if the chapter is not null and not empty
                count++;  // Increment the count for valid chapters
            }
        }
        return count;  // Return the total number of valid chapters
    }
}

// Runner class demonstrating the functionality of the BookV2 class
public class Task__3_part2_Encapsulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to take input from the user

        // Create the first book using the no-argument constructor
        BookV2 book1 = new BookV2();  // Instantiate a BookV2 object without initial author or chapters

        // Prompt the user to enter the author for the first book
        System.out.println("Enter the author for the first book:");
        String author1 = scanner.nextLine();  // Get the author's name from the user input
        book1.setAuthor(author1);  // Set the author name using the setter method

        // Initialize some chapters for the first book
        String[] chapters1 = {"Introduction", "Chapter 1", "Chapter 2", "Chapter 3"};  // Example chapter names
        book1.setChapterName(chapters1);  // Set the chapter names using the setter method

        // Create the second book using the parameterized constructor
        // This constructor initializes the author and chapters at the time of object creation
        System.out.println("Enter the author for the second book:");
        String author2 = scanner.nextLine();  // Get the author's name for the second book
        String[] chapters2 = {"Introduction", "Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4"};  // More chapters
        BookV2 book2 = new BookV2(author2, chapters2);  // Instantiate the second book with author and chapters

        // Compare the authors of both books
        boolean sameAuthor = BookV2.compareBooks(book1, book2);  // Use static method to compare the authors

        // Output the result of the comparison
        if (sameAuthor) {
            System.out.println("Both books have the same author.");
        } else {
            System.out.println("The books have different authors.");
        }

        // Compare the chapters and print the author of the book with more chapters
        BookV2 bookWithMoreChapters = BookV2.compareChapterNames(book1, book2);  // Compare chapter counts
        System.out.println("The book with more chapters is authored by: " + bookWithMoreChapters.getAuthor());  // Output the result
    }
}
