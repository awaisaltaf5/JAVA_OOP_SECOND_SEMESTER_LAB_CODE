// Encapsulation example using the account class
class account {
    // Private data members representing account details
    double accNumber;  // Account number of the user
    String name;       // Name of the account holder
    double accBalance; // Account balance
    String Email;      // Email of the account holder
    String date;       // Date of account creation or update

    // Getter method for 'accNumber'
    public double getAccNumber() {
        return accNumber;
    }

    // Setter method for 'accNumber' to set the account number
    public void setAccNumber(double accNumber) {
        this.accNumber = accNumber;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name' to set the name of the account holder
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'accBalance'
    public double getAccBalance() {
        return accBalance;
    }

    // Setter method for 'accBalance' to set the account balance
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    // Getter method for 'Email'
    public String getEmail() {
        return Email;
    }

    // Setter method for 'Email' to set the email address
    public void setEmail(String email) {
        Email = email;
    }

    // Getter method for 'date'
    public String getDate() {
        return date;
    }

    // Setter method for 'date' to set the date
    public void setDate(String date) {
        this.date = date;
    }
}

// Runner class to demonstrate the use of the 'account' class
public class Task2_Account {
    public static void main(String[] args) {
        // Creating a new account object
        account a1 = new account();

        // Setting values using setter methods
        a1.setName("Awais");                  // Setting the name of the account holder
        a1.setAccNumber(1203877);             // Setting the account number
        a1.setAccBalance(30000);              // Setting the account balance
        a1.setEmail("awais@gmail.com");       // Setting the email address
        a1.setDate("10/09/2024");             // Setting the date of account creation

        // Printing the account details using getter methods
        System.out.println("Name: " + a1.getName());               // Getting the name
        System.out.println("Account number: " + a1.getAccNumber()); // Getting the account number
        System.out.println("Account Balance: " + a1.getAccBalance()); // Getting the account balance
        System.out.println("Email: " + a1.getEmail());             // Getting the email
        System.out.println("Date: " + a1.getDate());               // Getting the date
    }
}
