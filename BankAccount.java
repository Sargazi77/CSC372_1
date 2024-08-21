// BankAccount.java
// This class represents a basic bank account with standard features.

public class BankAccount {
    // Fields
    private String firstName;  // The first name of the account holder
    private String lastName;   // The last name of the account holder
    private int accountID;     // The unique ID of the account
    private double balance;    // The current balance of the account

    // Constructor
    // Initializes the balance to zero when the account is created
    public BankAccount() {
        this.balance = 0.0;
    }

    // Deposit Method
    // Adds the specified amount to the account balance
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Withdrawal Method
    // Subtracts the specified amount from the account balance
    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    // Setters and Getters
    // Set and get the first name of the account holder
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    // Set and get the last name of the account holder
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // Set and get the account ID
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return this.accountID;
    }

    // Get the current balance of the account
    public double getBalance() {
        return this.balance;
    }

    // Account Summary Method
    // Prints all the details of the account
    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: " + balance);
    }
}
