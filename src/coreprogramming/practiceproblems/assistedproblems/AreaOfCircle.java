package coreprogramming.practiceproblems.assistedproblems;

import java.util.Scanner;

/**
 * AreaOfCircle class
 * ------------------
 * This program calculates the area of a circle
 * given its radius input by the user.
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        final double PI = 3.14; // Constant value for Pi

        Scanner input = new Scanner(System.in);

        // Ask user for the radius
        System.out.print("Enter radius of circle in cm: ");
        double radius = input.nextDouble();

        // Calculate area
        double area = PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("Area of circle is: " + area + " cm^2.");
    }
}
