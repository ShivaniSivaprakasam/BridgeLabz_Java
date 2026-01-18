package coreprogramming.practiceproblems.assistedproblems;

import java.util.Scanner;

/**
 * AddNumbers class
 * ----------------
 * This program takes two integers as input from the user
 * and prints their sum.
 */
public class AddNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        // Input second number
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        // Calculate sum
        int sum = firstNumber + secondNumber;

        // Display result
        System.out.println("The sum is: " + sum);
    }
}
