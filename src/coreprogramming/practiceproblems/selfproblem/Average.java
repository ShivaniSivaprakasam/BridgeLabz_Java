package coreprogramming.practiceproblems.selfproblem;
/*
This program reads three numbers from the user, calculates their average, and prints it.
*/

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to read input
        System.out.print("Enter first number: "); // Prompt user for first number
        double num1 = input.nextDouble(); // Read first number as double
        System.out.print("Enter second number: "); // Prompt user for second number
        double num2 = input.nextDouble(); // Read second number as double
        System.out.print("Enter third number: "); // Prompt user for third number
        double num3 = input.nextDouble(); // Read third number as double
        double average = (num1 + num2 + num3)/3; // Calculate average of three numbers
        System.out.println("The average is: " + average); // Display the average
    }
}
