package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class LeapYear {

    /*
     * This program checks whether a given year is a leap year according to the Gregorian calendar.
     * A leap year occurs:
     *  - Every 4 years, except for years divisible by 100
     *  - But years divisible by 400 are also leap years
     * The program ensures the user enters a valid year (>= 1582, 4-digit year) and demonstrates
     * input validation, loops, and conditional statements in Java.
     */

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Calculate the number of digits in the entered year
        int length = (int) Math.log10(year) + 1;

        // Validate the input: year must be 4 digits and >= 1582 (start of Gregorian calendar)
        while (length != 4 || year < 1582) {
            System.out.println("Please enter a valid year (>= 1582 and 4-digit): ");
            year = input.nextInt();
            length = (int) Math.log10(year) + 1;
        }

        // Check leap year conditions using conditional statements
        if (year % 400 == 0) {
            // Year divisible by 400 is a leap year
            System.out.println(year + " is a Leap year");
        } 
        else if (year % 100 == 0) {
            // Year divisible by 100 but not 400 is not a leap year
            System.out.println(year + " is Not a Leap year");
        } 
        else if (year % 4 == 0) {
            // Year divisible by 4 but not 100 is a leap year
            System.out.println(year + " is a Leap year");
        } 
        else {
            // All other years are not leap years
            System.out.println(year + " is Not a Leap year");
        }
    }
}
