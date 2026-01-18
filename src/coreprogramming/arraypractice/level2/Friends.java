/**
 * Program Name: Friends
 *
 * Description:
 * This program stores information (name, age, height) for 3 friends,
 * takes their details as input, validates the data, and identifies:
 * 1. The youngest friend
 * 2. The tallest friend
 *
 * Steps:
 * 1. Initialize names of friends in an array.
 * 2. Create arrays to store age and height for each friend.
 * 3. Input age and height for each friend with validation (must be positive).
 * 4. Identify the youngest and tallest friend using loops.
 * 5. Display the names and corresponding age/height of the youngest and tallest friends.
 *
 * Concepts Used:
 * - Arrays
 * - Loops
 * - Conditional statements
 * - Input validation
 */
package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class Friends {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Array of friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Number of friends
        int size = 3;

        // Arrays to store age and height for each friend
        double[] age = new double[size];
        double[] height = new double[size];

        // Loop to input age and height for each friend
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for " + names[i]);

            // Input age
            System.out.print("Enter age: ");
            age[i] = input.nextDouble();

            // Input height
            System.out.print("Enter height: ");
            height[i] = input.nextDouble();

            // Validate that age and height are positive
            if (height[i] <= 0 || age[i] <= 0) {
                System.out.println("The age and height entered is invalid.");
                i--; // Repeat input for this friend
                continue;
            }
        }

        // Variables to track index of youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest friend
        for (int i = 0; i < size; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i; // Update youngest index
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i; // Update tallest index
            }
        }

        // Display the youngest friend
        System.out.println("\nYoungest friend: " + names[youngestIndex]
                + " (Age: " + age[youngestIndex] + ")");

        // Display the tallest friend
        System.out.println("Tallest friend: " + names[tallestIndex]
                + " (Height: " + height[tallestIndex] + ")");
    }
}
