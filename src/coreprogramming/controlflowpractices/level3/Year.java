package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class Year {

    /*
     * This program checks whether a given year is a leap year according to the Gregorian calendar.
     * Leap year rules:
     *  - A year divisible by 4 is a leap year,
     *  - Except years divisible by 100 are not leap years,
     *  - But years divisible by 400 are leap years.
     * The program ensures the user enters a valid 4-digit year >= 1582.
     * It demonstrates input validation, loops, and conditional statements in Java.
     */

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Calculate the number of digits in the entered year
        int length = (int) Math.log10(year) + 1;

        // Validate the input: year must be 4 digits and >= 1582
        while (length != 4 || year < 1582) {
            System.out.println("Please enter a valid year (>= 1582 and 4-digit): ");
            year = input.nextInt();
            length = (int) Math.log10(year) + 1;
        }

        // Check leap year using combined conditional expression
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
