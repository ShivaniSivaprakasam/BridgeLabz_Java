package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class DateComparison {

    /*
     * This program compares two dates entered by the user.
     * The user inputs day, month, and year for two dates.
     * The program then determines whether the first date is:
     *  - before the second date,
     *  - after the second date, or
     *  - the same as the second date.
     * This demonstrates user input, methods, conditional statements, and return values in Java.
     */

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first date
        System.out.println("Enter first date:");
        int day1 = getInput(scanner, "Day: ");
        int month1 = getInput(scanner, "Month: ");
        int year1 = getInput(scanner, "Year: ");

        // Prompt user to enter the second date
        System.out.println("Enter second date:");
        int day2 = getInput(scanner, "Day: ");
        int month2 = getInput(scanner, "Month: ");
        int year2 = getInput(scanner, "Year: ");

        // Compare the two dates using a separate method
        int result = compareDates(day1, month1, year1, day2, month2, year2);

        // Print the comparison result
        if (result < 0) {
            System.out.println("The first date is before the second date.");
        } else if (result > 0) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        // Close the Scanner object to free resources
        scanner.close();
    }

    /**
     * Prompts the user for input and reads an integer value.
     *
     *  scanner Scanner object for reading input
     *  prompt  Message to display to the user
     *  integer input entered by the user
     */
    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    /**
     * Compares two dates.
     *
     *  day1   Day of first date
     *  month1 Month of first date
     *  year1  Year of first date
     *  day2   Day of second date
     * month2 Month of second date
     *  year2  Year of second date
     *-1 if first date is before second, 1 if after, 0 if same
     */
    public static int compareDates(int day1, int month1, int year1,
                                   int day2, int month2, int year2) {
        if (year1 != year2) {
            return (year1 < year2) ? -1 : 1;
        } else if (month1 != month2) {
            return (month1 < month2) ? -1 : 1;
        } else if (day1 != day2) {
            return (day1 < day2) ? -1 : 1;
        } else {
            return 0;
        }
    }
}
