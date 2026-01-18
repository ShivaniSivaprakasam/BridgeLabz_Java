/**
 * Program Name: SmallestNumber
 *
 * Description:
 * This program determines the smallest number among three numbers entered
 * by the user. It also handles the case where two or more numbers are equal.
 *
 * Steps:
 * 1. Input three numbers from the user.
 * 2. Use conditional statements to compare the numbers.
 * 3. Print which number is the smallest or indicate if multiple numbers are equal.
 *
 * Concepts Used:
 * - Conditional statements (if-else)
 * - Scanner for user input
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Getting first number from the user
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        // Getting second number from the user
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Getting third number from the user
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Checking which number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number " + number1 + " the smallest? Yes");
        } 
        else if (number2 < number1 && number2 < number3) {
            System.out.println("Is the second number " + number2 + " the smallest? Yes");
        } 
        else if (number3 < number1 && number3 < number2) {
            System.out.println("Is the third number " + number3 + " the smallest? Yes");
        } 
        else {
            // Case when two or more numbers are equal
            System.out.println("Out of the three entered numbers more than one number are equal.");
        }
    }
}
