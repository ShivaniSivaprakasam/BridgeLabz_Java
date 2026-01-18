package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program calculates the total income
 * by adding salary and bonus.
 */
public class TotalIncome {

    public static void main(String[] args) {

        // Taking salary input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        float salary = input.nextFloat();

        // Taking bonus input from the user
        System.out.print("Enter bonus: ");
        float bonus = input.nextFloat();

        // Calculating total income
        float income = salary + bonus;

        // Displaying salary, bonus, and total income
        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence the total income is INR " + income + ".");
    }
}
