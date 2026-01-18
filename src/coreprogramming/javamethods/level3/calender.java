package coreprogramming.javamethods.level3;

import java.util.Scanner;

/*
 * Calendar class
 * ------------------
 * This program displays a monthly calendar for a given month and year.
 * It calculates leap years and determines the day of the week for the 1st day.
 */
public class CalendarProgram {

    // Month names
    static String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Days in each month for non-leap years
    static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Check if a given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get number of days in a given month/year
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { // February
            return isLeapYear(year) ? 29 : 28;
        }
        return daysInMonth[month - 1];
    }

    // Get month name from month number
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    // Calculate the day of the week for 1st day of the month
    // 0=Sunday, 1=Monday, ..., 6=Saturday
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    // Display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        System.out.println("      " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getDaysInMonth(month, year);

        // Print initial spaces for the first week
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days of the month
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // New line after Saturday
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        displayCalendar(month, year);
    }
}
