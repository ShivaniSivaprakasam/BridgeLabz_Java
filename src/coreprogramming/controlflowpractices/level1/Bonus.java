/**
 * Program Name: Bonus
 *
 * Description:
 * This program calculates a bonus for an employee based on years of service.
 * If the employee has more than 5 years of service, they receive a 5% bonus on their salary.
 * Otherwise, no bonus is given.
 *
 * Steps:
 * 1. Input salary and years of service from the user.
 * 2. Check if years of service > 5.
 *    - If yes, calculate bonus = 5% of salary.
 *    - Else, no bonus is given.
 * 3. Display the bonus amount or "No bonus".
 *
 * Concepts Used:
 * - Conditional statements (if-else)
 * - Input using Scanner
 * - Basic arithmetic operations
 */
package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting salary input from user
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Getting years of service input from user
        System.out.print("Enter years of service: ");
        double years = input.nextDouble();

        // Calculate bonus based on years of service
        if (years > 5) {
            double bonus = (salary * 5) / 100; // 5% of salary
            System.out.println("The bonus received is: " + bonus);
        } else {
            System.out.println("No bonus.");
        }
    }
}

