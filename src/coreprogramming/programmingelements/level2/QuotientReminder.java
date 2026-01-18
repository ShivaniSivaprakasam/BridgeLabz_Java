package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program calculates the quotient and remainder
 * of two given numbers.
 */
public class QuotientReminder {

    public static void main(String[] args) {

        // Taking input values from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float number1 = input.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = input.nextFloat();

        // Calculating quotient and remainder
        float quotient = number1 / number2;
        float remainder = number1 % number2;

        // Displaying the result
        System.out.println("The quotient is " + quotient +
                " and remainder is " + remainder +
                " of two numbers " + number1 + " and " + number2);
    }
}

