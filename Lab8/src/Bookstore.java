// Abstract class Book
abstract class Book {
    protected String title;
    protected String author;
    protected double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Abstract methods
    public abstract void displayDetails(); // Displays book details
    public abstract void calculateDiscount(); // Calculates discount on the book
}

// FictionBook class
class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Price: $" + price);
    }

    @Override
    public void calculateDiscount() {
        price = price - (price * 0.10); // Apply 10% discount
        System.out.println("Discounted Price: $" + price);
    }
}

// NonFictionBook class
class NonFictionBook extends Book {
    private String topic;

    public NonFictionBook(String title, String author, double price, String topic) {
        super(title, author, price);
        this.topic = topic;
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Topic: " + topic);
        System.out.println("Price: $" + price);
    }

    @Override
    public void calculateDiscount() {
        price = price - (price * 0.05); // Apply 5% discount
        System.out.println("Discounted Price: $" + price);
    }
}

// ReferenceBook class
class ReferenceBook extends Book {
    private int edition;

    public ReferenceBook(String title, String author, double price, int edition) {
        super(title, author, price);
        this.edition = edition;
    }

    @Override
    public void displayDetails() {
        System.out.println("Reference Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
        System.out.println("Price: $" + price);
    }

    @Override
    public void calculateDiscount() {
        System.out.println("No discount available for Reference Books.");
    }
}

// Main class to test the implementation
public class Bookstore {
    public static void main(String[] args) {
        // Create instances of each book type
        Book fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 20.00, "Classic Fiction");
        Book nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", 25.00, "History");
        Book referenceBook = new ReferenceBook("Java Programming", "James Gosling", 50.00, 3);

        // Test FictionBook
        System.out.println("Testing FictionBook:");
        fictionBook.displayDetails();
        fictionBook.calculateDiscount();

        // Test NonFictionBook
        System.out.println("\nTesting NonFictionBook:");
        nonFictionBook.displayDetails();
        nonFictionBook.calculateDiscount();

        // Test ReferenceBook
        System.out.println("\nTesting ReferenceBook:");
        referenceBook.displayDetails();
        referenceBook.calculateDiscount();
    }
}
