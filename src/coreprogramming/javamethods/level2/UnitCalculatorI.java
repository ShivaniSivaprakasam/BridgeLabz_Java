package coreprogramming.javamethods.level1;

import java.util.Scanner;

/*
 * UnitCalculatorI class
 * ---------------------
 * This class provides methods to convert units of distance between:
 * 1. Kilometers and Miles
 * 2. Miles and Kilometers
 * 3. Meters and Feet
 * 4. Feet and Meters
 * The main method reads values from the user for each unit and prints
 * the converted results using the respective methods.
 */
public class UnitCalculatorI {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double milesConversion = km * 0.621371; // Conversion factor: 1 km = 0.621371 miles
        return milesConversion;
    }

    // Method to convert miles to kilometers
    public static double convertMilesTokm(double miles) {
        double kmConversion = miles * 1.60934; // Conversion factor: 1 mile = 1.60934 km
        return kmConversion;
    }

    // Method to convert meters to feet
    public static double convertMeterToFeet(double meter) {
        double feetConversion = meter * 3.28084; // Conversion factor: 1 meter = 3.28084 feet
        return feetConversion;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeter(double feet) {
        double meterConversion = feet * 0.3048; // Conversion factor: 1 foot = 0.3048 meters
        return meterConversion;
    }

    // Main method to get input from user and display converted units
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object to read user input

        // Prompt user for input
        System.out.print("Enter km: ");
        double km = input.nextDouble(); // Read kilometers from user

        System.out.print("Enter miles: ");
        double miles = input.nextDouble(); // Read miles from user

        System.out.print("Enter meter: ");
        double meter = input.nextDouble(); // Read meters from user

        System.out.print("Enter feet: ");
        double feet = input.nextDouble(); // Read feet from user

        // Call conversion methods and store results
        double result1 = convertKmToMiles(km);
        double result2 = convertMilesTokm(miles);
        double result3 = convertMeterToFeet(meter);
        double result4 = convertFeetToMeter(feet);

        // Display conversion results
        System.out.println("The km to miles conversion: " + result1);
        System.out.println("The miles to km conversion: " + result2);
        System.out.println("The meter to feet conversion: " + result3);
        System.out.println("The feet to meter conversion: " + result4);
    }
}
