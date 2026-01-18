package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/**
 * This program performs basic arithmetic operations (addition, subtraction, multiplication, division)
 * on two numbers entered by the user and displays the results.
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Read two numbers from the user
        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumber = scanner.nextFloat();

        // Perform arithmetic operations
        float addition = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;

        // Display results in formatted way
        System.out.printf(
            "Results for %.2f and %.2f:%nAddition: %.2f%nSubtraction: %.2f%nMultiplication: %.2f%nDivision: %.2f%n",
            firstNumber, secondNumber, addition, subtraction, multiplication, division
        );
    }
}
