package coreprogramming.practiceproblems.assistedproblems;

import java.util.Scanner;

/**
 * TempConversion class
 * --------------------
 * This program converts a temperature from Celsius to Fahrenheit.
 */
public class TempConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit + " degrees F");
    }
}
