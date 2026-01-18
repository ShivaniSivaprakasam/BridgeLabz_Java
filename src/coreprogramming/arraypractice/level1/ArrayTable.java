/**
 * Program Name: ArrayTable
 *
 * Description:
 * This program generates a multiplication table for a user-entered number.
 * The results of multiplication from 6 to 9 are stored in an integer array.
 * The array is then displayed using a loop.
 *
 * Concepts Used:
 * - Arrays
 * - Loops (for loop)
 * - User input using Scanner
 */
package coreprogramming.arraypractice.level1;
import java.util.Scanner;
public class ArrayTable {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Asking the user to enter a number
        System.out.print("Enter the number for which the multiplication table is needed: ");
        // Reading the number entered by the user
        int number = input.nextInt();
        // Declaring an array to store multiplication results (6 to 9 → 4 values)
        int[] table = new int[4];
        // Variable to track the index of the array
        int value = 0;
        // Loop to calculate multiplication table from 6 to 9
        for ( int i = 6; i <= 9; i ++ ){
            // Storing the multiplication result in the array
            table[value] = number*i;
            // Incrementing array index
            value++;
        }
        // Displaying the multiplication table stored in the array
        System.out.print("The array with multiplication table from 9 to 6 is: ");
        // Loop to print each element of the array
        for ( int i = 0; i <= table.length - 1; i ++ ){
            // Printing array element
            System.out.print(table[i] + " ");
        }
    }
}

