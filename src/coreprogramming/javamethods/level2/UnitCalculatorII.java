package coreprogramming.javamethods.level2;

import java.util.Scanner;

/*
 * UnitCalculatorII class
 * ----------------------
 * This class provides methods to convert distances between different units:
 * 1. Yards to Feet and Feet to Yards
 * 2. Meters to Inches and Inches to Meters
 * 3. Inches to Centimeters
 * 
 * The main method prompts the user to input distances in various units,
 * performs conversions using the defined methods, and prints the results.
 */
public class UnitCalculatorII {

    // Convert yards to feet (1 yard = 3 feet)
    public static double convertYardsToFeet(double yards) {
        double feetConversion = yards * 3;
        return feetConversion;
    }

    // Convert feet to yards (1 foot = 0.333333 yards)
    public static double convertFeetToYards(double feet) {
        double yardsConversion = feet * 0.333333;
        return yardsConversion;
    }

    // Convert meters to inches (1 meter = 39.3701 inches)
    public static double convertMeterToInches(double meter) {
        double inchConversion = meter * 39.3701;
        return inchConversion;
    }

    // Convert inches to meters (1 inch = 0.0254 meters)
    public static double convertInchesToMeter(double inch) {
        double meterConversion = inch * 0.0254;
        return meterConversion;
    }

    // Convert inches to centimeters (1 inch = 2.54 cm)
    public static double convertInchesToCm(double inch) {
        double cmConversion = inch * 2.54;
        return cmConversion;
    }

    // Main method to demonstrate all unit conversions
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object for user input

        // Prompt user for distances in various units
        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter distance in meters: ");
        double meter = input.nextDouble();

        System.out.print("Enter distance in inch: ");
        double inch = input.nextDouble();

        // Call conversion methods and store results
        double result1 = convertYardsToFeet(yards);
        double result2 = convertFeetToYards(feet);
        double result3 = convertMeterToInches(meter);
        double result4 = convertInchesToMeter(inch);
        double result5 = convertInchesToCm(inch);

        // Display all conversion results in a single line
        System.out.println("The distance unit conversion results are: " 
            + result1 + " , " 
            + result2 + " , "  
            + result3 + " , " 
            + result4 + " and " 
            + result5 + ".");
    }
}
