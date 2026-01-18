package coreprogramming.javamethods.level2;

import java.util.Scanner;

public class LeapYear {

    /*
     * This method checks whether a given year is a leap year
     * Returns true if leap year, otherwise false
     */
    public static boolean isLeapYear(int year) {

        // Leap year rules
        if (year % 400 == 0) {
            return true;
        } 
        else if (year % 100 == 0) {
            return false;
        } 
        else return year % 4 == 0;
    }

    /*
     * This method validates the year
     * Year must be 4 digits and >= 1582
     */
    public static boolean isValidYear(int year) {
        int length = (int) Math.log10(year) + 1;
        return length == 4 && year >= 1582;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;

        // Input validation loop
        while (true) {
            System.out.print("Enter a valid year (>= 1582): ");
            year = input.nextInt();

            if (isValidYear(year)) {
                break;
            }
            System.out.println("Invalid year! Try again.");
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

        input.close();
    }
}
