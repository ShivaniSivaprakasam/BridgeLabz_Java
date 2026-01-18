package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program swaps two numbers
 * using a temporary variable.
 */
public class SwapNumber {

    public static void main(String[] args) {

        // Taking two numbers as input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (number1): ");
        int number1 = input.nextInt();

        System.out.print("Enter number (number2): ");
        int number2 = input.nextInt();

        // Displaying original numbers
        System.out.println("Original(number1) : " + number1);
        System.out.println("Original(number2) : " + number2);

        // Swapping numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Displaying swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2 + ".");
    }
}
