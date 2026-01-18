package objectorientedprogramming.classobjects.level2;
/*
This program simulates a simple ATM system.
It allows a user to:
1. Create a bank account with holder name, account number, and initial balance.
2. Deposit an amount into the account.
3. Withdraw an amount from the account.
4. Display the current balance.
The BankAccount class stores account details and ATM class handles transactions.
*/

import java.util.Scanner;
// Created a class bank account
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
// Created a main class called ATM
public class ATM {
    public static void deposit(BankAccount account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public static void withdraw(BankAccount account, double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    public static void balanceDisplay(BankAccount account) {
        System.out.println("Your balance is: " + account.getBalance());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter account holder name: ");
        String accountHolder = input.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        deposit(account, depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        withdraw(account, withdrawAmount);
        // Calling method
        balanceDisplay(account);

    }
}

