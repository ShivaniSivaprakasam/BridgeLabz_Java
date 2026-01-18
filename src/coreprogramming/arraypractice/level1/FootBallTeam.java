/**
 * Program Name: FootBallTeam
 *
 * Description:
 * This program stores the heights of 11 football players in an array.
 * It accepts height values from the user, displays them, calculates
 * the total height, and then computes the mean (average) height.
 *
 * Concepts Used:
 * - Arrays
 * - Loops
 * - User input using Scanner
 * - Basic arithmetic operations
 */

package coreprogramming.arraypractice.level1;

import java.util.Scanner;

public class FootBallTeam {

    public static void main(String[] args) {

        // Creating Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Declaring an array to store heights of 11 football players
        double[] heights = new double[11];

        // Prompting the user to enter heights
        System.out.print("Enter height of 11 players: ");

        // Loop to read height values into the array
        for (int i = 0; i < 11; i++) {

            // Storing each height entered by the user
            heights[i] = input.nextDouble();
        }

        // Displaying the heights entered by the user
        System.out.print("The entered heights are: ");

        // Loop to print all height values
        for (int i = 0; i < 11; i++) {

            // Printing each player's height
            System.out.println(heights[i] + " ");
        }

        // Variable to store the sum of heights
        int sum = 0;

        // Loop to calculate the sum of all heights
        for (int i = 0; i < 11; i++) {

            // Adding each height to the sum
            sum += heights[i];
        }

        // Displaying the total sum of heights
        System.out.println("The sum of heights is: " + sum);

        // Calculating the mean (average) height
        double meanHeight = sum / 11;

        // Displaying the mean height of the football players
        System.out.println("The mean height of 11 football players is: " + meanHeight);
    }
}
