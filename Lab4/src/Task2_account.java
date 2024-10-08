import java.util.Scanner;
public class Task2_account {
    private double balance;

    // Default constructor
    public Task2_account() {
        this.balance = 0.0;
    }

    // Constructor with balance parameter
    public Task2_account(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating the first account
Scanner input=new Scanner(System.in);
        System.out.println("Enter the balance");
double balance=input.nextDouble();
        Task2_account account1 = new Task2_account(balance);
        account1.displayBalance();

        // Creating the second account with the same balance as the first account
        Task2_account account2 = new Task2_account(account1.getBalance());
        account2.displayBalance();

        // Testing deposit and withdrawal methods
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.displayBalance();

        account2.deposit(300.0);
        account2.withdraw(100.0);
        account2.displayBalance();
    }
}
