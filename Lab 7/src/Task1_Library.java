// Base class Item
class Item {
    // Attributes common to all items (e.g., Books, DVDs)
    private int id;
    private String title;
    private int year;

    // Constructor for Item to initialize common fields
    public Item(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    // Method to display common information for all items
    public void displayInfo() {
        System.out.println("ID: " + id); // Display item ID
        System.out.println("Title: " + title); // Display item title
        System.out.println("Year: " + year); // Display year of release/publish
    }
}

// Derived class Book, which extends the Item class
class Book extends Item {
    // Attribute specific to books
    private String author;

    // Constructor for Book to initialize both common (id, title, year) and specific (author) fields
    public Book(int id, String title, int year, String author) {
        super(id, title, year); // Call the constructor of the base class (Item)
        this.author = author; // Initialize author field
    }

    // Method to display book-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method to display common information
        System.out.println("Author: " + author); // Display author information specific to books
    }
}

// Derived class DVD, which extends the Item class
class DVD extends Item {
    // Attributes specific to DVDs
    private String director; // Director of the DVD
    private int duration; // Duration of the DVD in minutes

    // Constructor for DVD to initialize both common (id, title, year) and specific (director, duration) fields
    public DVD(int id, String title, int year, String director, int duration) {
        super(id, title, year); // Call the constructor of the base class (Item)
        this.director = director; // Initialize director field
        this.duration = duration; // Initialize duration field
    }

    // Method to display DVD-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method to display common information
        System.out.println("Director: " + director); // Display director information specific to DVDs
        System.out.println("Duration: " + duration + " minutes"); // Display the duration of the DVD
    }
}

// Main class to test the program functionality
public class Task1_Library {
    public static void main(String[] args) {
        // Creating a Book object with id, title, year, and author
        Book book = new Book(1, "Bang-e-darra", 1960, "Allama Iqbal");

        // Creating a DVD object with id, title, year, director, and duration
        DVD dvd = new DVD(2, "Code with Awais", 2024, "Muhammad Awais Altaf", 20);

        // Displaying book information
        System.out.println("Book Info:");
        book.displayInfo(); // Calls the overridden method in Book class, which displays both common and book-specific info

        // Displaying DVD information
        System.out.println("\nDVD Info:");
        dvd.displayInfo(); // Calls the overridden method in DVD class, which displays both common and DVD-specific info
    }
}
