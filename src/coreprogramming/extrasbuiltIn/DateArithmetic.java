package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class DateArithmetic {

    /*
     * This program performs date arithmetic operations.
     * It reads a date (day, month, year) from the user and then performs a series of adjustments:
     *  - Adds 7 days
     *  - Adjusts the month and year if the day exceeds the month length
     *  - Increments the month and year in sequence
     *  - Subtracts 21 days and adjusts the month/year if necessary
     * The program also considers leap years when calculating the number of days in February.
     * This demonstrates user input, arrays, methods, arithmetic operations, loops, and conditional statements.
     */

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the day
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // Prompt user to enter the month (1-12)
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Prompt user to enter the year
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Step 1: Add 7 days to the current date
        day += 7;

        // Step 2: Get the number of days in each month for the current year
        int[] daysInMonth = getDaysInMonth(year);

        // Adjust the day and month if day exceeds the number of days in the month
        if (day > daysInMonth[month - 1]) {
            day -= daysInMonth[month - 1];
            month++;
        }

        // Step 3: Increment month
        month++;
        if (month > 12) {
            month = 1; // Reset month to January
            year++;    // Increment year
        }

        // Step 4: Increment year by 2
        year += 2;

        // Step 5: Subtract 21 days and adjust month/year if day becomes <= 0
        day -= 21;
        while (day <= 0) {
            month--;
            if (month <= 0) {
                month = 12; // Reset month to December
                year--;      // Decrement year
            }
            daysInMonth = getDaysInMonth(year); // Recalculate days in month for leap year
            day += daysInMonth[month - 1];
        }

        // Print the final date after all arithmetic operations
        System.out.println("Final date: " + day + "/" + month + "/" + year);

        // Close the Scanner object to free resources
        scanner.close();
    }

    /**
     * This method returns the number of days in each month for a given year.
     * February has 29 days if the year is a leap year.
     *
     *  year The year for which to get month lengths
     *  Array of days in each month (index 0 = January)
     */
    public static int[] getDaysInMonth(int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year and adjust February
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        return daysInMonth;
    }
}
