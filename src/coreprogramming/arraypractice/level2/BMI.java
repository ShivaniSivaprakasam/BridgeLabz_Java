/**
 * Program Name: BMI
 *
 * Description:
 * This program calculates the Body Mass Index (BMI) of each person
 * in a team based on their weight and height.
 * 
 * For each person:
 * - BMI is calculated using the formula: BMI = weight / (height^2)
 * - A weight status is assigned based on BMI:
 *      < 18.5 : Underweight
 *      18.5 - 24.9 : Normal weight
 *      25 - 29.9 : Overweight
 *      >= 30 : Obese
 *
 * The program then displays weight, height, BMI, and weight status
 * in a tabular format.
 *
 * Concepts Used:
 * - Arrays
 * - Loops
 * - Conditional statements
 * - User input using Scanner
 * - Formatted output
 */

package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting user to enter number of people in the team
        System.out.print("Enter number of people in a team: ");
        int people = input.nextInt();

        // Declaring arrays to store weight, height, BMI, and weight status
        double[] weight = new double[people];
        double[] height = new double[people];
        double[] BMI = new double[people];
        String[] weightStatus = new String[people];

        // Loop to read weight and height for each person
        for (int i = 0; i < people; i++) {

            // Displaying person number
            System.out.println("Enter details of person " + (i + 1));

            // Prompting and reading weight
            System.out.print("Enter weight of each people in the team: ");
            weight[i] = input.nextDouble();

            // Prompting and reading height
            System.out.print("Enter height of each people in the team: ");
            height[i] = input.nextDouble();
        }

        // Displaying weight array
        System.out.println("Weight array: ");
        for (int i = 0; i < people; i++) {
            System.out.print(weight[i] + " ");
        }

        // Displaying height array
        System.out.println("\nHeight array: ");
        for (int i = 0; i < people; i++) {
            System.out.print(height[i] + " ");
        }

        // Calculating BMI and weight status for each person
        for (int i = 0; i < people; i++) {

            // BMI formula: weight (kg) / (height (m) ^ 2)
            BMI[i] = weight[i] / (height[i] * height[i]);

            // Assigning weight status based on BMI
            if (BMI[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (BMI[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (BMI[i] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the results in a tabular format
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < people; i++) {

            // Printing height, weight, BMI, and status formatted to 2 decimal places
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    height[i], weight[i], BMI[i], weightStatus[i]);
        }
    }
}
