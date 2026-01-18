/**
 * Program Name: ArrayTwoD
 *
 * Description:
 * This program demonstrates the use of a two-dimensional array in Java.
 * It accepts user input for the number of rows and columns, stores elements
 * in a 2D array, displays them, and then converts the 2D array into a 1D array.
 *
 * Concepts Used:
 * - 2D Arrays
 * - 1D Arrays
 * - Nested loops
 * - User input using Scanner
 */
package coreprogramming.arraypractice.level1;
import java.util.Scanner;
public class ArrayTwoD {
    public static void main(String[] args) {
        // Creating Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        // Asking the user for the number of rows
        System.out.print("Enter rows: ");
        // Reading the number of rows
        int rows = input.nextInt();
        // Asking the user for the number of columns
        System.out.print("Enter columns: ");
       // Reading the number of columns
        int columns = input.nextInt();
        // Initializing a 2D array with given rows and columns
        int[][] arr = new int[rows][columns];
        // Initializing a 1D array to store converted elements
        int[] array = new int[rows*columns];
        // Prompting user to enter elements of the 2D array
        System.out.print("Enter elements of the 2D array: ");
        // Loop to insert elements into the 2D array
        for ( int i = 0; i < rows; i++){
            for ( int j = 0; j < columns; j++ ){
                // Reading and storing element at position [i][j]
                arr[i][j] = input.nextInt();
            }
        }
        // Displaying the elements of the 2D array
        System.out.println("The elements of the 2d array is: ");
        // Loop to print 2D array elements
        for ( int i = 0; i < rows; i++){
            for ( int j = 0; j < columns; j++ ){
                // Printing each element
                System.out.print(arr[i][j] + " ");
            }
            // Moving to the next row
            System.out.println();
        }
        // Variable to track the index for the 1D array
        int index = 0;
        // Converting the 2D array into a 1D array
        for ( int i = 0; i <rows; i++){
            for ( int j = 0; j < columns; j++ ){
                // Copying element from 2D array to 1D array
                array[index] = arr[i][j];
                // Incrementing the index
                index++;
            }
        }
        // Displaying the elements of the converted 1D array
        System.out.println("The 1D array is: ");
        // Loop to print 1D array elements
        for ( int i = 0; i < rows*columns; i++){
            // Printing element of 1D array
            System.out.print(array[i] + " ");
        }
    }
}
