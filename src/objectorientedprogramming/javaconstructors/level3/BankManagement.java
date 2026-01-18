package objectorientedprogramming.javaconstructors.level3;
// Single-line comment: BankAccount and SavingsAccount demonstration

/*
BankAccount Management System:
1. BankAccount class with:
   - public accountNumber
   - protected accountHolder
   - private balance
2. Public methods to access and modify balance
3. SavingsAccount subclass demonstrates access to public and protected members
*/

class BankAccount {
    public int accountNumber;       // Public: accessible everywhere
    protected String accountHolder; // Protected: accessible in subclass
    private double balance;         // Private: accessible only in this class

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : $" + balance);
    }
}

// Subclass demonstrating access to public and protected members
class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account info
    public void displaySavingsDetails() {
        System.out.println("\n--- Savings Account Details ---");
        // Accessing public and protected members of superclass
        System.out.println("Account Number : " + accountNumber);      // public
        System.out.println("Account Holder : " + accountHolder);    // protected
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Balance        : $" + getBalance());    // via public method
    }
}

// Main class to test
public class BankManagement {
    public static void main(String[] args) {
        // Creating BankAccount object
        BankAccount b1 = new BankAccount(101, "Alice", 1000);
        b1.displayAccountDetails();

        // Depositing and withdrawing
        b1.deposit(500);
        b1.withdraw(200);
        b1.displayAccountDetails();

        // Creating SavingsAccount object
        SavingsAccount s1 = new SavingsAccount(102, "Bob", 2000, 4.5);
        s1.deposit(500);           // inherited method
        s1.displaySavingsDetails(); // subclass display
    }
}
