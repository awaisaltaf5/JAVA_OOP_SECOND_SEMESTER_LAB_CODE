import java.util.Scanner;

// Encapsulation example using the Book class
class Book {
    // Private data members for author and chapter names
    private String author;
    private String[] chapterName = new String[100];  // Array to store up to 100 chapter names

    // No-argument constructor to initialize default values
    public Book() {
        this.author = "";
    }

    // Constructor with parameters to initialize author and chapter names
    public Book(String author, String[] chapterName) {
        this.author = author;
        this.chapterName = chapterName;
    }

    // Getter method to access the private 'author' variable
    public String getAuthor() {
        return author;
    }

    // Getter method to access the private 'chapterName' array
    public String[] getChapterName() {
        return chapterName;
    }

    // Static method to compare authors of two Book objects
    public static boolean compareBooks(Book book1, Book book2) {
        // Return true if authors are the same, otherwise false
        return book1.getAuthor().equals(book2.getAuthor());
    }
}

/* Another approach (non-static) to compare books could be to use an instance method:
public boolean compareBooks(Book otherBook) {
    return this.author.equals(otherBook.getAuthor()); // Compare current object's author with another book's author
}
*/

// Runner class for the Book example
public class Task__3_Encapsulation_Book {
    public static void main(String[] args) {
        String a1;  // Variable to store author 1's name
        String a2;  // Variable to store author 2's name

        // Taking input from the user for author 1
        System.out.println("Enter the author 1 Name:");
        Scanner a = new Scanner(System.in);
        a1 = a.nextLine();

        // Taking input from the user for author 2
        System.out.println("Enter the author 2 Name:");
        Scanner b = new Scanner(System.in);
        a2 = b.nextLine();

        // Defining chapters for both books
        String[] ch1 = {"Introduction", "Chapter 1", "Chapter 2 and so on"};
        String[] ch2 = {"Introduction", "Chapter 1", "Chapter 2 Chapter 3 and so on"};

        // Creating two Book objects using constructor with parameters
        Book book1 = new Book(a1, ch1);
        Book book2 = new Book(a2, ch2);

        // Comparing the authors of both books
        boolean sameAuthor = Book.compareBooks(book1, book2);

        // Alternatively, we could use a non-static method to compare (commented out approach)
        // boolean sameAuthor = book1.compareBooks(book2);

        // Outputting whether the authors are the same or different
        if (sameAuthor) {
            System.out.println("Both books have the same author.");
        } else {
            System.out.println("The books have different authors.");
        }
    }
}
