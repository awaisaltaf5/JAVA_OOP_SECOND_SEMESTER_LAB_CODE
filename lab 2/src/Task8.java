public class Student {

    // Fields to store student details
    String name;
    String rollNo;
    String department;

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Creating 3 student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Assigning values to s1
        s1.name = "Muhammad Awais Altaf";
        s1.rollNo = "SP23948";
        s1.department = "BSSE";

        // Assigning values to s2
        s2.name = "Ali Hassan";
        s2.rollNo = "SP2456";
        s2.department = "BSSE";

        // Assigning values to s3
        s3.name = "Ammar";
        s3.rollNo = "SP2898";
        s3.department = "BSSE";

        // Displaying the details of each student
        s1.display();
        s2.display();
        s3.display();
    }
}
