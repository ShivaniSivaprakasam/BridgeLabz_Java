package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program converts temperature from
 * Celsius to Fahrenheit.
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        // Taking temperature input in Celsius
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Converting Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Displaying the converted temperature
        System.out.println("The " + celsius +
                " celsius is " + fahrenheitResult + " fahrenheit.");
    }
}

