/**
 * Program Name: ReverseArray
 *
 * Description:
 * This program takes a number as input and stores its digits in reverse order
 * in an array. It then displays the digits in reversed order.
 *
 * Steps:
 * 1. Input a number from the user.
 * 2. Calculate the number of digits in the number.
 * 3. Create an array of the appropriate size.
 * 4. Extract each digit using modulus (%) and division (/), and store in the array.
 * 5. Display the digits of the number in reverse order using the array.
 *
 * Concepts Used:
 * - Arrays
 * - Loops
 * - Modulus and division for digit extraction
 * - Math.log10() to calculate number of digits
 * - Input using Scanner
 */

package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Calculate the number of digits in the number
        int length = (int) Math.log10(number) + 1;

        // Create array to store digits
        int[] arr = new int[length];
        int index = 0;

        // Extract digits from number and store in array
        for (int i = 0; i < length; i++) {
            arr[index] = number % 10; // Get last digit
            number = number / 10;      // Remove last digit
            index++;
        }

        // Display the reversed array
        System.out.println("The reverse array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
