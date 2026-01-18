/**
 * Program Name: FactorArray
 *
 * Description:
 * This program finds all the factors of a user-entered number.
 * The factors are stored in an integer array.
 * If the array becomes full, its size is dynamically increased.
 * Finally, all the factors are displayed using a loop.
 *
 * Concepts Used:
 * - Arrays
 * - Dynamic array resizing
 * - Loops
 * - Conditional statements
 * - User input using Scanner
 */
package coreprogramming.arraypractice.level1;
import java.util.Scanner;

public class FactorArray {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Asking the user to enter a number
        System.out.print("Enter a number: ");
        // Reading the number entered by the user
        int number = input.nextInt();
         // Initial size of the factor array
        int maxFactor = 10;
        // Declaring array to store factors
        int[] factor = new int[maxFactor];
        // Index to track the number of factors found
        int index = 0;
        // Loop to find all factors of the number
        for (int i = 1; i <= number; i++) {
            // Checking whether 'i' is a factor of the number
            if (number % i == 0) {
                // Checking if the array is full
                if (index == maxFactor) {
                    // Doubling the size of the array
                    int newSize = maxFactor * 2;
                     // Creating a temporary array with new size
                    int[] temp = new int[newSize];
                     // Copying existing elements to the new array
                    for (int j = 0; j < factor.length; j++) {
                        temp[j] = factor[j];
                    }
                    // Updating reference to the new array
                    factor = temp;
                    // Updating the maximum size
                    maxFactor = newSize;
                }
                // Storing the factor in the array
                factor[index] = i;
                // Moving to the next index
                index++;
            }
        }
        // Displaying all the factors stored in the array
        System.out.print("The array of factors is: ");
        // Loop to print only the valid factor values
        for (int i = 0; i < index; i++) {
            // Printing each factor
            System.out.print(factor[i] + " ");
        }
    }
}
