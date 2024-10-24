// Base class 'person' representing a general person with name and age
class person {
    // Data members (attributes)
    String name;  // Name of the person
    int age;      // Age of the person

    // Constructor to initialize 'name' and 'age'
    public person(String name, int age) {
        this.name = name;  // Assign the name passed as argument
        this.age = age;    // Assign the age passed as argument
    }

    // Method to display the name and age of the person
    public void display() {
        System.out.println("Name is " + name + " and age is " + age);  // Display name and age
    }
}

// 'teacher' class extending 'person'
// Inherits properties and behaviors from the 'person' class
class teacher extends person {
    // Additional attribute specific to 'teacher'
    String Subject;  // Subject the teacher teaches

    // Constructor for 'teacher' class
    // It calls the superclass constructor to initialize 'name' and 'age'
    public teacher(String name, int age, String Subject) {
        super(name, age);  // Call to parent class constructor to initialize name and age
        this.Subject = Subject;  // Initialize subject specific to teacher
    }

    // Method to display the subject the teacher teaches
    public void teach() {
        System.out.println("Teaches: " + Subject);  // Print the subject being taught
    }
}

// 'student1' class extending 'person'
// Inherits properties and behaviors from the 'person' class
class student1 extends person {
    // Additional attribute specific to 'student1'
    String Grade;  // Grade of the student

    // Constructor for 'student1' class
    // It calls the superclass constructor to initialize 'name' and 'age'
    public student1(String name, int age, String Grade) {
        super(name, age);  // Call to parent class constructor to initialize name and age
        this.Grade = Grade;  // Initialize grade specific to student
    }

    // Method to display the student's grade
    public void status() {
        System.out.println("Grade: " + Grade);  // Print the student's grade
    }
}

// Main class to demonstrate inheritance
public class Tut2_Inheritence_Person {
    public static void main(String[] args) {
        // Create an object of 'teacher' class
        teacher t = new teacher("Mr. Waqar", 28, "Programming Fundamentals");

        // Create an object of 'student1' class
        student1 s = new student1("Muhammad Awais Altaf", 19, "A+");

        // Display details and actions of the teacher
        t.display();  // Call inherited method to display name and age
        t.teach();    // Call specific method of teacher to display the subject

        // Display details and status of the student
        s.display();  // Call inherited method to display name and age
        s.status();   // Call specific method of student1 to display the grade
    }
}
