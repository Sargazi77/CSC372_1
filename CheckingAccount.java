// CheckingAccount.java
// This class represents a checking account, which is a type of bank account that allows for overdraft.

public class CheckingAccount extends BankAccount {
    // Field for the interest rate
    private double interestRate;

    // Process Withdrawal Method
    // Handles withdrawals that may result in an overdraft, adding a $30 fee
    public void processWithdrawal(double amount) {
        if (amount > getBalance()) {
            // If the withdrawal amount is more than the balance, apply overdraft fee
            withdrawal(amount + 30);  // Overdraft fee of $30
            System.out.println("Overdraft fee applied. New balance: " + getBalance());
        } else {
            // Otherwise, just withdraw the amount normally
            withdrawal(amount);
        }
    }

    // Display Account Method
    // Displays all account details along with the interest rate
    public void displayAccount() {
        accountSummary();  // Calls the method from BankAccount to display common details
        System.out.println("Interest Rate: " + interestRate);
    }

    // Setter and Getter for Interest Rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }
}