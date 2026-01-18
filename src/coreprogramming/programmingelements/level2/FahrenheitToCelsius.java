package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program converts temperature from
 * Fahrenheit to Celsius.
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {

        // Taking temperature input in Fahrenheit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double fahrenheit = input.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Displaying the converted temperature
        System.out.println("The " + fahrenheit +
                " fahrenheit is " + celsiusResult + " celsius.");
    }
}

