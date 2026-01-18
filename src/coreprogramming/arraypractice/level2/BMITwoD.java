/**
 * Program Name: BMITwoD
 *
 * Description:
 * This program calculates the Body Mass Index (BMI) for multiple people
 * using a 2D array to store each person's weight, height, and BMI.
 *
 * Steps:
 * 1. Take number of persons as input.
 * 2. For each person, input weight and height (validated to be positive).
 * 3. Calculate BMI using the formula: BMI = weight / (height^2)
 * 4. Assign weight status based on BMI:
 *      < 18.5      : Underweight
 *      18.5 - 24.9 : Normal weight
 *      25 - 29.9   : Overweight
 *      >= 30       : Obese
 * 5. Display height, weight, BMI, and weight status in a tabular format.
 *
 * Concepts Used:
 * - 2D Arrays
 * - Loops
 * - Conditional statements
 * - Input validation
 * - Formatted output
 */
package coreprogramming.arraypractice.level2;

import java.util.Scanner;

public class BMITwoD {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting user to enter the number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // Declaring 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[number][3];

        // Array to store the weight status for each person
        String[] weightStatus = new String[number];

        // Loop to input weight and height for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            // Input and validate weight
            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();

                // Weight must be positive
                if (personData[i][0] > 0) {
                    break;
                }
                System.out.println("Invalid weight! Enter a positive value.");
            }

            // Input and validate height
            while (true) {
                System.out.print("Enter height (meters): ");
                personData[i][1] = input.nextDouble();

                // Height must be positive
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Invalid height! Enter a positive value.");
            }
        }

        // Loop to calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            // Calculate BMI and store in the 3rd column of 2D array
            personData[i][2] = weight / (height * height);

            // Assign weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results in a tabular format
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            // Printing height, weight, BMI, and weight status formatted to 2 decimals
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    personData[i][1],
                    personData[i][0],
                    personData[i][2],
                    weightStatus[i]);
        }
    }
}
