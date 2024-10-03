package Lab3.src;

import java.util.Scanner;

// Account class to manage account details and transactions
 public class Task5_Account {
    private int accno;       // Account number
    private float balance;    // Account balance

    // Constructor to initialize account number and balance
    public Task5_Account(int a, float b) {
        this.accno = a;
        this.balance = b;
    }

    // Method to withdraw money from the account
    public void withdraw(int w) {
        if (w > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= w; // Update balance after withdrawal
            System.out.println("Withdrawal of " + w + " successful.");
        }
    }

    // Method to deposit money into the account
    public void deposit(int d) {
        balance += d; // Update balance after deposit
        System.out.println("Deposit of " + d + " successful.");
    }

    // Method to display account details
    public void display() {
        System.out.println("Account Number: " + accno);
        System.out.println("Current Balance: " + balance);
    }

    // Getter for balance
    public float getBalance() {
        return balance;
    }
}

// Calculate class to manage calculations and display results
class Calculate {
    private Task5_Account account; // Reference to Account object

    // Constructor to initialize Calculate with an Account
    public Calculate(Task5_Account account) {
        this.account = account;
    }

    // Method to display total balance, amount withdrawn, and total after withdrawal
    public void displayTotal(float amountWithdrawn) {
        float totalAfterWithdrawn = account.getBalance() + amountWithdrawn; // Total after withdrawal
        System.out.println("\nTotal Balance: " + account.getBalance());
        System.out.println("Amount Withdrawn: " + amountWithdrawn);
        System.out.println("Total After Withdrawal: " + totalAfterWithdrawn);
    }
}

// Main class to run the program
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Get account details from the user
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter initial balance: ");
        float initialBalance = scanner.nextFloat();

        // Create an Account object
        Task5_Account myAccount = new Task5_Account(accountNumber, initialBalance);

        // Display account details
        myAccount.display();

        // User input for deposit and withdrawal
        System.out.print("\nEnter amount to deposit: ");
        int depositAmount = scanner.nextInt();
        myAccount.deposit(depositAmount);   // Deposit specified amount

        System.out.print("\nEnter amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        myAccount.withdraw(withdrawAmount);   // Withdraw specified amount

        // Create a Calculate object and display total balance and transactions
        Calculate calc = new Calculate(myAccount);
        calc.displayTotal(withdrawAmount);   // Display with the amount withdrawn

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
