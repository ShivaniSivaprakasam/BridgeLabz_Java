package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class SumToNegative {

    public static void main(String[] args) {

        /*
         * This program continuously accepts numbers from the user and sums them.
         * The program stops when the user enters zero or a negative number.
         * After that, it displays the total sum before the termination input.
         */

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Initializing total sum variable
        double total = 0.0;

        // Loop to keep accepting numbers until a non-positive value is entered
        while (true) {

            // Prompting user to enter a number
            System.out.print("Enter number: ");
            double value = input.nextDouble();

            // Breaking the loop if the entered value is zero or negative
            if (value <= 0) {
                break;
            }

            // Adding the entered value to the total sum
            total = total + value;

            // Displaying the current sum
            System.out.println("The sum is: " + total);
        }

        // Displaying the final total sum before termination
        System.out.println("The sum achieved before reaching zero or a negative number is: " + total);

        // Informing the user why the program ended
        System.out.println("The user has entered zero or a negative number");
    }
}
