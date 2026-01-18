package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class OddEven {

    /*
     * This program counts and prints all odd and even numbers
     * from 1 up to a user-provided positive number.
     * Steps:
     * 1. Take user input for a positive number.
     * 2. Validate input to ensure it's positive and non-zero.
     * 3. Loop from 1 to the entered number:
     *    - Check if each number is odd or even.
     *    - Print the number along with "Odd" or "Even".
     *    - Maintain counters for both odd and even numbers.
     * 4. Print the counts of odd and even numbers at the end.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner for user input

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input to ensure positive non-zero number
        while (number <= 0) {
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

        // Loop from 1 to number to check each number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Even");
                countEven++;
            } else {
                System.out.println(i + " Odd");
                countOdd++;
            }
        }

        // Display total counts
        System.out.println("The count of even numbers from 1 to " + number + " is: " + countEven);
        System.out.println("The count of odd numbers from 1 to " + number + " is: " + countOdd);
    }
}
