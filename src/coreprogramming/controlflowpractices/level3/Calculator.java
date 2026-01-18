package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class Calculator {

    /*
     * This program is a simple calculator that performs basic arithmetic operations:
     * addition (+), subtraction (-), multiplication (*), and division (/).
     * The user inputs two numbers and an operator, and the program computes 
     * and displays the result. Invalid operations are handled using a default case.
     * This program demonstrates user input, switch-case statements, and arithmetic operations in Java.
     */

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        float firstNumber = input.nextFloat();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        float secondNumber = input.nextFloat();

        // Prompt the user to enter the operation (+, -, *, /)
        System.out.print("Enter operation: ");
        String op = input.next();

        // Use switch-case to perform the selected operation
        switch (op) {
            case "+":
                // Perform addition
                float add = firstNumber + secondNumber;
                System.out.println("Result: " + add);
                break;

            case "-":
                // Perform subtraction
                float sub = firstNumber - secondNumber;
                System.out.println("Result: " + sub);
                break;

            case "*":
                // Perform multiplication
                float multiplication = firstNumber * secondNumber;
                System.out.println("Result: " + multiplication);
                break;

            case "/":
                // Perform division
                if (secondNumber != 0) {
                    float div = firstNumber / secondNumber;
                    System.out.println("Result: " + div);
                } else {
                    // Handle division by zero
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                // Handle invalid operation input
                System.out.println("Invalid operation. Please use +, -, *, or /.");
        }
    }
}
