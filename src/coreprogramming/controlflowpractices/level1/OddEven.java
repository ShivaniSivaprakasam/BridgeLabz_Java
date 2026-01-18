/**
 * Program Name: OddEven
 *
 * Description:
 * This program reads a positive non-zero integer from the user and prints
 * whether each number from 1 up to that number is odd or even. It also counts
 * and displays the total number of odd and even numbers in the range.
 *
 * Steps:
 * 1. Input a positive integer from the user.
 * 2. Validate the input to ensure it is positive and non-zero.
 * 3. Use a for loop to check each number from 1 to the entered number:
 *    - Determine if it is even or odd.
 *    - Count the number of even and odd numbers.
 * 4. Display the counts and individual numbers with their odd/even status.
 *
 * Concepts Used:
 * - Loops (for loop)
 * - Conditional statements (if-else)
 * - Arithmetic operations (%)
 * - Scanner for user input
 */

package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input to ensure it is positive and non-zero
        while (number <= 0){
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
        }

        // Variables to store counts of even and odd numbers
        int countEven = 0;
        int countOdd = 0;

        // Loop through numbers from 1 to input number
        for (int i = 1; i <= number; i++){
            if (i % 2 == 0) {
                System.out.println(i + " Even");
                countEven++;
            } else {
                System.out.println(i + " Odd");
                countOdd++;
            }
        }

        // Display the counts of even and odd numbers
        System.out.println("The count of even numbers found in number from 1 to " + number + " are: " + countEven);
        System.out.println("The count of odd numbers found in number from 1 to " + number + " are: " + countOdd);
    }
}
