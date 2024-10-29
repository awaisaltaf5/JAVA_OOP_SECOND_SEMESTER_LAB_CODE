// Base class Movie
class Movie {
    // Private fields common to all movies
    private String title;
    private String mpaaRating;
    private int idNumber;

    // Constructor to initialize common fields (title, MPAA rating, and ID number)
    public Movie(String title, String mpaaRating, int idNumber) {
        this.title = title;
        this.mpaaRating = mpaaRating;
        this.idNumber = idNumber;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for MPAA rating
    public String getMpaaRating() {
        return mpaaRating;
    }

    // Getter method for ID number
    public int getIdNumber() {
        return idNumber;
    }

    // Method to calculate late fees (default: $2/day for generic movies)
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0; // Base rate: $2 per day
    }

    // Method to compare movies based on ID number
    public boolean equals(Movie otherMovie) {
        return this.idNumber == otherMovie.idNumber; // Two movies are equal if their ID numbers are the same
    }
}

// Action class, derived from Movie
class Action extends Movie {
    // Constructor for Action movies, calling the base class constructor to initialize common fields
    public Action(String title, String mpaaRating, int idNumber) {
        super(title, mpaaRating, idNumber);
    }

    // Override method to calculate late fees for Action movies ($3/day)
    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 3.0; // Action movies have a higher late fee: $3 per day
    }
}

// Comedy class, derived from Movie
class Comedy extends Movie {
    // Constructor for Comedy movies, calling the base class constructor
    public Comedy(String title, String mpaaRating, int idNumber) {
        super(title, mpaaRating, idNumber);
    }

    // Override method to calculate late fees for Comedy movies ($2.50/day)
    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.5; // Comedy movies have a late fee of $2.50 per day
    }
}

// Drama class, derived from Movie
class Drama extends Movie {
    // Constructor for Drama movies, calling the base class constructor
    public Drama(String title, String mpaaRating, int idNumber) {
        super(title, mpaaRating, idNumber);
    }

    // Drama movies have the same late fee as the default ($2/day), so no need to override calcLateFees
}

// Main class to test the Movie system
public class Task2_Movie {
    public static void main(String[] args) {
        // Create instances of Action, Comedy, and Drama movies
        Action actionMovie = new Action("Action Movie", "PG-13", 101); // Action movie with ID 101
        Comedy comedyMovie = new Comedy("Comedy Movie", "PG", 102);   // Comedy movie with ID 102
        Drama dramaMovie = new Drama("Drama Movie", "R", 103);        // Drama movie with ID 103

        // Test late fees calculation by passing the number of days late
        System.out.println(actionMovie.getTitle() + " late fee for 5 days: $" + actionMovie.calcLateFees(5)); // Action: 5 days late
        System.out.println(comedyMovie.getTitle() + " late fee for 3 days: $" + comedyMovie.calcLateFees(3)); // Comedy: 3 days late
        System.out.println(dramaMovie.getTitle() + " late fee for 7 days: $" + dramaMovie.calcLateFees(7));   // Drama: 7 days late

        // Test equality of two movies based on their ID numbers
        Action anotherActionMovie = new Action("Another Action Movie", "PG-13", 101); // Action movie with the same ID as the first one
        System.out.println("Are the two action movies equal? " + actionMovie.equals(anotherActionMovie)); // Should return true because IDs are the same
    }
}
