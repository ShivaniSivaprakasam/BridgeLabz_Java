package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/**
 * This program converts a distance from kilometers to miles.
 * It prompts the user to enter the distance in km,
 * converts it to miles, and displays the result.
 */
public class ConvertToMiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Prompt user to enter distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles
        final double KM_TO_MILES_CONVERSION = 0.621371;
        double miles = kilometers * KM_TO_MILES_CONVERSION;

        // Display result
        System.out.printf("%.2f km is equal to %.2f miles.%n", kilometers, miles);
    }
}

