package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;

public class MultiplicationTable {

    /*
     * This program prints the multiplication table of a number
     * for the multiples from 6 to 9.
     * Steps:
     * 1. Take user input for the number.
     * 2. Use a for loop to multiply the number by 6, 7, 8, and 9.
     * 3. Print each result in a formatted way.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner for user input

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiplication table of " + number + " from 6 to 9:");

        // Loop to calculate and print multiples from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int table = number * i;
            System.out.println(number + " x " + i + " = " + table);
        }
    }
}
