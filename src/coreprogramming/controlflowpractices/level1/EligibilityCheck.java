/**
 * Program Name: EligibilityCheck
 *
 * Description:
 * This program checks if a person is eligible to vote based on their age.
 * The user is prompted to enter their age, and input validation ensures the age is positive.
 * The program then determines if the person can vote (age >= 18) or not.
 *
 * Steps:
 * 1. Input age from the user.
 * 2. Validate that age is greater than 0 using a while loop.
 * 3. Use if-else to check if age >= 18.
 * 4. Display eligibility message.
 *
 * Concepts Used:
 * - Loops (while) for input validation
 * - Conditional statements (if-else)
 * - Scanner for user input
 */
package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class EligibilityCheck {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting age input from user
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Validate age: must be greater than 0
        while (age <= 0) {
            System.out.print("Please enter a valid age: ");
            age = input.nextInt();
        }

        // Check voting eligibility
        if (age >= 18) {
            System.out.print("The person's age is " + age + " and can vote.");
        } else {
            System.out.print("The person's age is " + age + " and cannot vote.");
        }
    }
}
