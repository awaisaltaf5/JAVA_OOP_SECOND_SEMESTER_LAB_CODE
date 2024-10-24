// Encapsulation example using the individual class
class individual {
    // Private data members for name and age (good practice for encapsulation)
    String name;
    int age;

    // Getter method for 'name' to access the private variable
    public String getName() {
        return name;
    }

    // Setter method for 'name' to set the value of the private variable
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age' to access the private variable
    public int getAge() {
        return age;
    }

    // Setter method for 'age' to set the value of the private variable
    public void setAge(int age) {
        this.age = age;
    }
}

// Runner class to demonstrate encapsulation
public class Task__1_Encapsulation_Person {
    public static void main(String[] args) {
        // Creating an object of the 'individual' class
        individual i = new individual();

        // Using setter methods to assign values to the private fields
        i.setName("Muhammad Awais Altaf");  // Setting the name of the individual
        i.setAge(19);                       // Setting the age of the individual

        // Using getter methods to retrieve and print the values
        System.out.println("Name is " + i.getName() + " and Age is " + i.getAge());  // Getting and displaying the name and age
    }
}
