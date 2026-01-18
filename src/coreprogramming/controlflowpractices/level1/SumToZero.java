package coreprogramming.controlflowpractices.level1;

import java.util.Scanner;

public class SumToZero {

    /*
     * This program repeatedly takes positive numbers from the user and sums them.
     * The program stops when the user enters zero.
     * It then displays the total sum accumulated before zero was entered.
     */

    public static void main(String[] args) {

        // Creating a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompting the user for the first number
        System.out.print("Enter number: ");
        double value = input.nextDouble();

        // Initializing the total sum variable
        double total = 0.0;

        // Loop to continue as long as the entered value is positive
        while (value > 0) {

            // Adding the entered value to the total sum
            total = total + value;

            // Displaying the current sum
            System.out.println("The sum is: " + total);

            // Prompting the user for the next number
            System.out.print("Enter number: ");
            value = input.nextDouble();
        }

        // Displaying the final sum before the user entered zero
        System.out.println("The sum achieved before reaching zeros is: " + total);

        // Informing the user that zero was entered
        System.out.println("The user has entered zero");;
    }
}
