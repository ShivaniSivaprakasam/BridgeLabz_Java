package coreprogramming.javamethods.level2;

import java.util.Scanner;

/*
 * UnitCalculatorIII class
 * ------------------------
 * This class provides methods to convert between various units of:
 * 1. Temperature: Fahrenheit ↔ Celsius
 * 2. Weight: Pounds ↔ Kilograms
 * 3. Volume: Gallons ↔ Liters
 * 
 * The main method prompts the user to input values for each unit,
 * performs conversions using the respective methods, and displays the results.
 */
public class UnitCalculatorIII {

    // Convert Fahrenheit to Celsius: C = (F - 32) * 5 / 9
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsiusConversion = (fahrenheit - 32) * 5 / 9;
        return celsiusConversion;
    }

    // Convert Celsius to Fahrenheit: F = (C * 9 / 5) + 32
    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheitConversion = (celsius * 9 / 5) + 32;
        return fahrenheitConversion;
    }

    // Convert Pounds to Kilograms: 1 pound = 0.453592 kg
    public static double convertPoundsToKilograms(double pound) {
        double kilogramConversion = pound * 0.453592;
        return kilogramConversion;
    }

    // Convert Kilograms to Pounds: 1 kg = 2.20462 pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double poundsConversion = kilograms * 2.20462;
        return poundsConversion;
    }

    // Convert Gallons to Liters: 1 gallon = 3.78541 liters
    public static double convertGallonsToLiters(double gallon) {
        double literConversion = gallon * 3.78541;
        return literConversion;
    }

    // Convert Liters to Gallons: 1 liter = 0.264172 gallons
    public static double convertLitersToGallons(double liters) {
        double gallonConversion = liters * 0.264172;
        return gallonConversion;
    }

    // Main method to read input from user and display all conversions
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        // Prompt user for temperature, weight, and volume inputs
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double pound = input.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter volume in gallons: ");
        double gallon = input.nextDouble();

        System.out.print("Enter volume in liters: ");
        double liters = input.nextDouble();

        // Perform conversions using defined methods
        double result1 = convertFahrenheitToCelsius(fahrenheit);
        double result2 = convertCelsiusToFahrenheit(celsius);
        double result3 = convertPoundsToKilograms(pound);
        double result4 = convertKilogramsToPounds(kilograms);
        double result5 = convertGallonsToLiters(gallon);
        double result6 = convertLitersToGallons(liters);

        // Display all results with descriptive text
        System.out.println("Conversion results:");
        System.out.println("Fahrenheit to Celsius: " + result1);
        System.out.println("Celsius to Fahrenheit: " + result2);
        System.out.println("Pounds to Kilograms: " + result3);
        System.out.println("Kilograms to Pounds: " + result4);
        System.out.println("Gallons to Liters: " + result5);
        System.out.println("Liters to Gallons: " + result6);
    }
}
