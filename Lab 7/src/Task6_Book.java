// Class representing BOOKS
class BOOKS {

    // Attributes of the book: title, author, and year
    String title, author;
    int year;

    // Constructor with title only
    public BOOKS(String title) {
        this.title = title; // Initializes the title
    }

    // Constructor with title and author
    public BOOKS(String title, String author) {
        this.title = title;   // Initializes the title
        this.author = author; // Initializes the author
    }

    // Constructor with title, author, and year
    public BOOKS(String title, String author, int year) {
        this.title = title;   // Initializes the title
        this.author = author; // Initializes the author
        this.year = year;     // Initializes the year
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title); // Display title

        // Check if author is provided, if yes, display it
        if (author != null) {
            System.out.println("Author: " + author);
        }

        // Check if year is provided (year is not 0), if yes, display it
        if (year != 0) {
            System.out.println("Year: " + year);
        }
    }
}

// Main class to test the BOOKS class
public class Task6_Book {
    public static void main(String[] args) {
        // Creating Book objects with different constructors
        BOOKS book1 = new BOOKS("Banng-e-Darra");                       // Only title
        BOOKS book2 = new BOOKS("Banng-e-Darra", "Allama Iqbal");        // Title and author
        BOOKS book3 = new BOOKS("Banng-e-Darra", "Allama Iqbal", 1960); // Title, author, and year

        // Displaying book details using the display method
        book1.display(); // Displays title only
        book2.display(); // Displays title and author
        book3.display(); // Displays title, author, and year
    }
}
