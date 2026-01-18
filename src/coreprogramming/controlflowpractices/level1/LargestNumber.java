/**
 * Program Name: LargestNumber
 *
 * Description:
 * This program reads three integer numbers from the user and determines
 * which number is the largest. If more than one number is equal and largest,
 * it prints a message stating that more than one number are equal.
 *
 * Steps:
 * 1. Input three integers from the user.
 * 2. Use if-else statements to compare the numbers and find the largest.
 * 3. Display the result.
 *
 * Concepts Used:
 * - Conditional statements (if-else)
 * - Logical operators (&&)
 * - Scanner for user input
 */
package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Getting three numbers from the user
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Determine the largest number using if-else statements
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number " + number1 + " the largest? Yes");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number " + number2 + " the largest? Yes");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number " + number3 + " the largest? Yes");
        } else {
            System.out.println("Out of the three entered numbers more than one number are equal.");
        }
    }
}
