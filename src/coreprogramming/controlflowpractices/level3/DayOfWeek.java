package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class DayOfWeek {

    /*
     * This program calculates the day of the week for a given date according to the Gregorian calendar.
     * It takes user input for day, month, and year and uses Zeller's Congruence formula 
     * to compute the day of the week. The program also converts numeric months and days 
     * into their corresponding names for clarity.
     */

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the date
        System.out.print("Enter date (day): ");
        int d = input.nextInt();

        // Prompt the user to enter the month
        System.out.print("Enter month: ");
        int m = input.nextInt();

        // Prompt the user to enter the year
        System.out.print("Enter year: ");
        int y = input.nextInt();

        // Calculate year for the formula
        int y0 = y - (14 - m) / 12;

        // Calculate auxiliary value
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate month for the formula
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print calculated numeric values (optional, useful for debugging)
        System.out.println("Day of week (numeric) according to Gregorian calendar: " + d0);
        System.out.println("Month (numeric) according to Gregorian calendar: " + (m0 + 1)); // m0 starts from 0
        System.out.println("Year according to Gregorian calendar: " + y0);

        // Convert numeric month to month name using switch-case
        switch (m0 + 1) { // +1 because m0 in Zeller's formula is 0-based
            case 1: System.out.println("The Gregorian calendar month is: January"); break;
            case 2: System.out.println("The Gregorian calendar month is: February"); break;
            case 3: System.out.println("The Gregorian calendar month is: March"); break;
            case 4: System.out.println("The Gregorian calendar month is: April"); break;
            case 5: System.out.println("The Gregorian calendar month is: May"); break;
            case 6: System.out.println("The Gregorian calendar month is: June"); break;
            case 7: System.out.println("The Gregorian calendar month is: July"); break;
            case 8: System.out.println("The Gregorian calendar month is: August"); break;
            case 9: System.out.println("The Gregorian calendar month is: September"); break;
            case 10: System.out.println("The Gregorian calendar month is: October"); break;
            case 11: System.out.println("The Gregorian calendar month is: November"); break;
            case 12: System.out.println("The Gregorian calendar month is: December"); break;
            default: System.out.println("Invalid month calculated."); break;
        }

        // Convert numeric day of the week to day name using switch-case
        switch (d0) {
            case 0: System.out.println("The day of the week is: Sunday"); break;
            case 1: System.out.println("The day of the week is: Monday"); break;
            case 2: System.out.println("The day of the week is: Tuesday"); break;
            case 3: System.out.println("The day of the week is: Wednesday"); break;
            case 4: System.out.println("The day of the week is: Thursday"); break;
            case 5: System.out.println("The day of the week is: Friday"); break;
            case 6: System.out.println("The day of the week is: Saturday"); break;
            default: System.out.println("Invalid day calculated."); break;
        }
    }
}
