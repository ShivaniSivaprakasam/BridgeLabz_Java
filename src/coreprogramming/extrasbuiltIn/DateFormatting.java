package coreprogramming.extrasbuiltIn;

public class DateFormatting {

    /*
     * This program formats the current system date in multiple ways without using built-in date libraries.
     * It calculates the current date by converting milliseconds since Jan 1, 1970 (epoch) into days, months, and years.
     * The program displays the date in three formats:
     *  1. dd/MM/yyyy
     *  2. yyyy-MM-dd
     *  3. EEE, MMM dd, yyyy (weekday, abbreviated month)
     * It demonstrates arithmetic operations, loops, arrays, methods, and string formatting in Java.
     */

    public static void main(String[] args) {

        // Get current time in milliseconds since Jan 1, 1970
        long currentMillis = System.currentTimeMillis();

        // Convert milliseconds to total seconds and total days
        long totalSeconds = currentMillis / 1000;
        long totalDays = totalSeconds / (24 * 60 * 60);

        // Initialize starting date: Jan 1, 1970
        int year = 1970;
        int month = 1;
        int day = 1;

        // Store remaining days after accounting for years
        long daysLeft = totalDays;

        // Calculate current year by subtracting days of each year
        while (daysLeft >= (isLeapYear(year) ? 366 : 365)) {
            daysLeft -= (isLeapYear(year) ? 366 : 365);
            year++;
        }

        // Get the number of days in each month for the current year
        int[] daysInMonth = getDaysInMonth(year);

        // Calculate current month and day
        for (int i = 0; i < 12; i++) {
            if (daysLeft < daysInMonth[i]) {
                month = i + 1;       // Months are 1-indexed
                day = (int) daysLeft + 1; // Days are 1-indexed
                break;
            } else {
                daysLeft -= daysInMonth[i];
            }
        }

        // Format 1: dd/MM/yyyy
        String format1 = String.format("%02d/%02d/%04d", day, month, year);

        // Format 2: yyyy-MM-dd
        String format2 = String.format("%04d-%02d-%02d", year, month, day);

        // Arrays for weekday names and month abbreviations
        String[] weekdays = {"Thu", "Fri", "Sat", "Sun", "Mon", "Tue", "Wed"}; // Jan 1, 1970 was Thursday
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // Calculate current weekday index
        int weekdayIndex = (int)((totalDays + 4) % 7); // Offset 4 because Jan 1, 1970 was Thursday

        // Format 3: EEE, MMM dd, yyyy
        String format3 = weekdays[weekdayIndex] + ", " + months[month - 1] + " " + day + ", " + year;

        // Print all three formatted dates
        System.out.println("dd/MM/yyyy : " + format1);
        System.out.println("yyyy-MM-dd : " + format2);
        System.out.println("EEE, MMM dd, yyyy : " + format3);
    }

    /**
     * Checks if a year is a leap year.
     *
     *  year The year to check
     * true if leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Returns the number of days in each month for a given year.
     * February has 29 days if the year is a leap year.
     *
     * year The year to check
     *  Array of days in each month (index 0 = January)
     */
    public static int[] getDaysInMonth(int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        return daysInMonth;
    }
}
