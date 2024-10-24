// Encapsulation example using the Student class
class Student {
    // Private data members (encapsulation principle)
    private String name;
    private String rollno;
    private int fees;

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name' to set the value of the private variable
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'rollno'
    public String getRollno() {
        return rollno;
    }

    // Setter method for 'rollno' to set the value of the private variable
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    // Getter method for 'fees'
    public int getFees() {
        return fees;
    }

    // Setter method for 'fees' to set the value of the private variable
    public void setFees(int fees) {
        this.fees = fees;
    }
}

// Runner class to demonstrate encapsulation
public class Task1_Student_Encapsulation {
    public static void main(String[] args) {
        // Creating a Student object using the no-argument constructor
        Student s = new Student();

        // Using setter methods to assign values to private fields
        s.setName("Muhammad Awais Altaf");  // Setting the name of the student
        s.setFees(20000);                   // Setting the fee for the student
        s.setRollno("SP23948");              // Setting the roll number for the student

        // Using getter methods to retrieve and print the values
        System.out.println("Name: " + s.getName());       // Getting the name of the student
        System.out.println("Roll No: " + s.getRollno());  // Getting the roll number
        System.out.println("Fees: " + s.getFees());       // Getting the fee of the student
    }
}
