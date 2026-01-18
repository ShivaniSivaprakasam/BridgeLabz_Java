/**
 * Program Name: Season
 *
 * Description:
 * This program checks if a given date (month and day) falls within the
 * Spring season. Spring is defined as March 20 to June 20.
 *
 * Steps:
 * 1. Define a method isSpring() to determine if the date is in Spring.
 * 2. Input month and day from the user.
 * 3. Use the isSpring() method to check if the entered date is in Spring.
 * 4. Display appropriate message.
 *
 * Concepts Used:
 * - Methods
 * - Conditional statements (if-else)
 * - Scanner for user input
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class Season {

    // Method to check if the date is in Spring season
    public static boolean isSpring(int month, int day) {
        if (month < 3 || month > 6) { // Months outside March-June
            return false;
        }
        if (month == 3 && day >= 20 && day <= 31) { // March 20-31
            return true;
        }
        if (month == 4 && day >= 1 && day <= 30) { // April 1-30
            return true;
        }
        if (month == 5 && day >= 1 && day <= 31) { // May 1-31
            return true;
        }
        if (month == 6 && day >= 1 && day <= 20) { // June 1-20
            return true;
        }
        return false; // Any other date
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Getting month input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Getting day input
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Checking if the entered date is in Spring
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
