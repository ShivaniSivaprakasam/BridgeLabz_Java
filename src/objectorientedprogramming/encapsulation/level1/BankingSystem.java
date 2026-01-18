package objectorientedprogramming.encapsulation.level1;
/*
This program simulates a basic banking system with encapsulation, inheritance, and interfaces.
It allows a user to:
1. Choose an account type: Savings or Current.
2. Enter account details: number, holder name, and initial balance.
3. Deposit and withdraw amounts.
4. Display account details and calculate interest.
5. Apply for a loan and calculate loan eligibility.
The BankAccount abstract class stores common account details and methods.
SavingsAccount and CurrentAccount extend BankAccount and implement the Loanable interface for loan operations.
The BankingSystem class handles user input and processes the account actions.
*/

import java.util.Scanner;
// Creating an interface called lonable
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}
// Creating an abstract class 
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public abstract double calculateInterest();
    // Method to display details
    public void displayDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}
// Extending a class
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan applied under Savings Account.");
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}
// Extending a class
class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }

    public void applyForLoan() {
        System.out.println("Loan applied under Current Account.");
    }

    public double calculateLoanEligibility() {
        return balance * 3;
    }
}
// Creating a Main class named Banking System
public class BankingSystem {
    // Creating a method to process account
    public static void processAccount(BankAccount account) {
        account.displayDetails();
        double interest = account.calculateInterest();
        System.out.println("Calculated Interest: ₹" + interest);
        // Looping to get loan
        if (account instanceof Loanable) {
            Loanable loan = (Loanable) account;
            loan.applyForLoan();
            System.out.println("Loan Eligibility Amount: ₹" + loan.calculateLoanEligibility());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting user input
        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account;
        // Looping to get choice from user
        if (choice == 1) {
            account = new SavingsAccount(accNo, name, balance);
        } else {
            account = new CurrentAccount(accNo, name, balance);
        }
        // Getting user input
        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        account.withdraw(sc.nextDouble());
        // Calling method
        processAccount(account);
    }
}
