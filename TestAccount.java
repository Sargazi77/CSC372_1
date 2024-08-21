// BankTest.java
// This class is used to test the functionality of the BankAccount and CheckingAccount classes.

public class TestAccount {
    public static void main(String[] args) {
        // Test the BankAccount class

        // Create a BankAccount object
        BankAccount account = new BankAccount();
        account.setFirstName("Ali");
        account.setLastName("Ahmadi");
        account.setAccountID(123456);
        account.deposit(750.00);  // Deposit $750
        account.withdrawal(50.00);  // Withdraw $50
        account.accountSummary();  // Print account details

        // Test the CheckingAccount class

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Diba");
        checkingAccount.setLastName("Razavi");
        checkingAccount.setAccountID(654321);
        checkingAccount.deposit(800.00);  // Deposit $800
        checkingAccount.processWithdrawal(990.00); // Attempt to withdraw $990 (overdraft)
        checkingAccount.setInterestRate(0.02);  // Set interest rate to 2%
        checkingAccount.displayAccount();  // Display account details including interest rate
    }
}