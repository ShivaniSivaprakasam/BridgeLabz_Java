package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class Season {

    /*
     * This method checks whether the given date
     * falls in the Spring season.
     *
     * Spring Season Range:
     * - March 20 to June 20 (inclusive)
     *
     * Parameters:
     * - month : month number (1 to 12)
     * - day   : day of the month
     *
     * Returns:
     * - true  if the date is in Spring
     * - false otherwise
     */
    public static boolean isSpring(int month, int day) {

        // Spring does not occur before March or after June
        if (month < 3 || month > 6) {
            return false;
        }

        // Check Spring start in March
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }

        // Entire April is Spring
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }

        // Entire May is Spring
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }

        // Spring ends on June 20
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }

        // Any other date is not Spring
        return false;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read month from user
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Read day from user
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Check if the date falls in Spring season
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
