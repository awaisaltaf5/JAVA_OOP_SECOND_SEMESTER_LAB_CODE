// Encapsulation example using the animol class
class animol {
    // Private data members representing the animal's species, name, and age
    String Specie;
    String name;
    int age;

    // Getter method for 'Specie' to access the private field
    public String getSpecie() {
        return Specie;
    }

    // Setter method for 'Specie' to set the value of the private field
    public void setSpecie(String specie) {
        Specie = specie;
    }

    // Getter method for 'name' to access the private field
    public String getName() {
        return name;
    }

    // Setter method for 'name' to set the value of the private field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age' to access the private field
    public int getAge() {
        return age;
    }

    // Setter method for 'age' to set the value of the private field
    public void setAge(int age) {
        this.age = age;
    }
}

// Runner class to demonstrate encapsulation
public class Task__2_Encapsulation_Animal {
    public static void main(String[] args) {
        // Creating an instance of the animol class
        animol a = new animol();

        // Using setter methods to assign values to the private fields
        a.setSpecie("Cattle");   // Setting the species of the animal
        a.setName("Cow");        // Setting the name of the animal
        a.setAge(8);             // Setting the age of the animal

        // Using getter methods to retrieve and print the values
        System.out.println("Name: " + a.getName() +
                "\nSpecie: " + a.getSpecie() +
                "\nAge: " + a.getAge());  // Displaying the animal's name, species, and age
    }
}
