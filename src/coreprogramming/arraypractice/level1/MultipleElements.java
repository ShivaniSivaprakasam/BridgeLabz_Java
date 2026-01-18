/**
 * Program Name: MultipleElements
 *
 * Description:
 * This program accepts positive numbers from the user and stores them
 * in an array until either:
 * 1. A non-positive number is entered, or
 * 2. The array reaches its maximum size.
 *
 * The program then displays all stored elements and calculates
 * the total sum of the array elements.
 *
 * Concepts Used:
 * - Arrays
 * - while loop
 * - User input using Scanner
 * - Conditional statements
 */

package coreprogramming.arraypractice.level1;

import java.util.Scanner;

public class MultipleElements {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declaring an array to store a maximum of 10 double values
        double[] array = new double[10];

        // Variable to store the total sum of array elements
        double total = 0.0;

        // Index to track the number of elements added to the array
        int index = 0;

        // Infinite loop to continuously accept user input
        while (true) {

            // Prompting the user to enter a number
            System.out.print("Enter an number: ");

            // Reading the number entered by the user
            double number = input.nextDouble();

            // Checking if the entered number is non-positive
            if (number <= 0) {

                // Displaying error message and terminating input
                System.out.println("The number should be greater then zero.");
                break;
            }

            // Checking if the array has reached its maximum size
            if (index == 10) {

                // Informing the user that the array is full
                System.out.println("The array has reached maximum size.");
                break;
            }

            // Storing the valid number in the array
            array[index] = number;

            // Incrementing the index to move to the next position
            index++;
        }

        // Displaying the elements stored in the array
        System.out.println("The elements of the array are: ");

        // Loop to print each stored element and calculate the total
        for (int i = 0; i < index; i++) {

            // Printing the array element
            System.out.print(array[i] + " ");

            // Adding the element to the total sum
            total = total + array[i];
        }

        // Displaying the total of all elements
        System.out.println("\nThe total is: " + total);
    }
}
