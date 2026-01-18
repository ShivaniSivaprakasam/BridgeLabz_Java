package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/*
 * This program calculates the length of one side of a square
 * using the given perimeter.
 */
public class PerimeterOfSquare {

    public static void main(String[] args) {

        // Taking perimeter input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter of square in cm: ");
        double perimeter = input.nextDouble();

        // Calculating the side length of the square
        double side = perimeter / 4;

        // Displaying the result
        System.out.println("The length of the size is " + side +
                " cm whose perimeter is " + perimeter + " cm.");
    }
}
