package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/**
 * This program converts a distance from feet to yards and miles.
 * It prompts the user to enter distance in feet, performs the conversions,
 * and displays the results.
 */
public class DistanceConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Prompt user to enter distance in feet
        System.out.print("Enter distance in feet: ");
        float feet = scanner.nextFloat();

        // Convert feet to yards and miles
        final float FEET_PER_YARD = 3f;
        final float YARDS_PER_MILE = 1760f;

        float yards = feet / FEET_PER_YARD;
        float miles = yards / YARDS_PER_MILE;

        // Display the results in a readable format
        System.out.printf(
            "Distance: %.2f ft, %.2f yd, %.6f mi%n",
            feet, yards, miles
        );

        scanner.close(); // Close scanner to avoid resource leak
    }
}
