package coreprogramming.practiceproblems.selfproblem;
/*
This program converts a distance from kilometers to miles.
It reads a value in kilometers from the user, multiplies it by 0.621371, and prints the result in miles.
*/

import java.util.Scanner;
public class MilesConversion {
    public static void main(String[] args) {
        final double multiplier = 0.621371; // Conversion factor from km to miles
        Scanner input = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter the value in kilometers: "); // Prompt for kilometers
        double Km = input.nextDouble(); // Read kilometers as double
        double Miles = Km * multiplier; // Convert km to miles
        System.out.println("The distance in miles is: " + Miles + " mi."); // Display result
    }
}
