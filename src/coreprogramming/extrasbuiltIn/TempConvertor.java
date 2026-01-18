package coreprogramming.extrasbuiltIn;

import java.util.Scanner;

public class TempConvertor {

    /*
     * This program converts temperatures between Celsius and Fahrenheit.
     * It demonstrates the use of methods, arithmetic operations, and user input in Java.
     * 
     * Formulas used:
     *   Celsius to Fahrenheit: (Celsius * 9/5) + 32
     *   Fahrenheit to Celsius: (Fahrenheit - 32) * 5/9
     */

    /**
     * Converts Celsius to Fahrenheit.
     *
     *  celsius Temperature in Celsius
     *  Equivalent temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius.
     *
     *  fahrenheit Temperature in Fahrenheit
     *  Equivalent temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        // Convert and display temperature in Fahrenheit
        System.out.println(celsius + " degree C = " + celsiusToFahrenheit(celsius) + " degree F");

        // Prompt user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        // Convert and display temperature in Celsius
        System.out.println(fahrenheit + " degree F = " + fahrenheitToCelsius(fahrenheit) + " degree C");
    }
}
