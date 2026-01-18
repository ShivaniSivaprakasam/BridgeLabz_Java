package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class SmallestAndLargest {

    /*
     * This method finds the smallest and largest numbers
     * among three given integers.
     *
     * Parameters:
     * - num1, num2, num3 : three integer values
     *
     * Returns:
     * - an integer array where:
     *   index 0 -> smallest number
     *   index 1 -> largest number
     */
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {

        // Assume the first number is both smallest and largest initially
        int smallest = num1;
        int largest = num1;

        // Compare second number with current smallest
        if (num2 < smallest) {
            smallest = num2;
        }

        // Compare third number with current smallest
        if (num3 < smallest) {
            smallest = num3;
        }

        // Compare second number with current largest
        if (num2 > largest) {
            largest = num2;
        }

        // Compare third number with current largest
        if (num3 > largest) {
            largest = num3;
        }

        // Return smallest and largest values
        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read first number
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        // Read second number
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        // Read third number
        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();

        // Find smallest and largest numbers
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Display the results
        System.out.println(
                "The largest number and smallest number are: " +
                result[1] + " and " + result[0]
        );
    }
}
