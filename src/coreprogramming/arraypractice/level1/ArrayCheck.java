/**
 * Program Name: ArrayCheck
 *
 * Description:
 * This program demonstrates the use of arrays and loops in Java.
 * It accepts integer inputs from the user, stores them in an array,
 * and performs the following operations:
 * 1. Displays all array elements
 * 2. Checks whether each element is positive, negative, or zero
 * 3. Determines whether positive numbers are even or odd
 * 4. Compares the first and last elements to identify the largest,
 *    smallest, or equal values
 */
package coreprogramming.arraypractice.level1;
import java.util.Scanner;
public class ArrayCheck {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
         // Declaring an integer array of fixed size
        // Prompting the user to enter array elements
        System.out.print("Enter array of numbers: ");
        // Loop to read values into the array
        for ( int i = 0; i < 5; i++) {
            number[i] = input.nextInt();  // Storing user input in array
        }
        // Displaying the array elements
        System.out.print("Array of numbers are: ");
        for ( int i = 0; i < 5; i++) {
            System.out.println(number[i] + " "); // Printing current element
        }
        // Checking whether each element is positive, negative, or zero
        // Also checks if positive numbers are even or odd
        for ( int i = 0; i < number.length; i++) {
            // Checking if the number is positive
            if ( number[i] > 0 ) {
                System.out.println(number[i] + " is Positive.");
                // Checking even or odd for positive numbers
                if ( number[i] % 2 == 0 ) {
                    System.out.println(number[i] + " is even.");
                }
                else {
                    System.out.println(number[i] + " is odd.");
                }
            }
            // Checking if the number is negative
            else if ( number[i] < 0 ){
                System.out.println(number[i] + " is Negative.");
            }
            // If the number is neither positive nor negative
            else{
                System.out.println(number[i] + " is Zero.");
            }
        }
        // Comparing the first and last elements of the array
        // to determine largest, smallest, or equality
        for ( int i = 1; i < number.length; i++ ) {
            if ( number[0] > number[number.length - 1] ) {
                System.out.println(number[0] + " is largest.");
                break;
            }
            else if ( number[0] < number[number.length - 1] ) {
                System.out.println(number[0] + " is smallest.");
                break;
            }
            else{
                System.out.println(number[0] +" and " +number[number.length - 1] + " are equal.");
                break;
            }
        }
    }
}

