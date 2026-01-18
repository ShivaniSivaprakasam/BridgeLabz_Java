package coreprogramming.javamethods.level3;

import java.util.Scanner;

/*
 * DistanceAndLine class
 * ---------------------
 * This class provides functionality to:
 * 1. Calculate the Euclidean distance between two points (x1, y1) and (x2, y2).
 * 2. Find the equation of the line passing through the two points.
 * 
 * The line equation is represented in slope-intercept form: y = mx + b.
 * If the line is vertical, slope m is considered infinite, and b is NaN.
 * 
 * The main method reads two points from the user, calculates the distance,
 * determines the line equation, and prints the results.
 */
public class DistanceAndLine {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        // Distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate the slope (m) and y-intercept (b) of the line
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double m; // slope
        double b; // y-intercept

        if (x2 - x1 != 0) { // Normal line (not vertical)
            m = (y2 - y1) / (x2 - x1); // slope formula: (y2 - y1) / (x2 - x1)
            b = y1 - m * x1;           // intercept formula: b = y1 - m*x1
        } else { // Vertical line: slope is infinite
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN; // No y-intercept for vertical line
        }

        return new double[]{m, b}; // Return slope and intercept as an array
    }

    // Main method to read user input and display distance and line equation
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        // Read coordinates of the first point
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Read coordinates of the second point
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between (%.2f, %.2f) and (%.2f, %.2f) = %.2f\n",
                x1, y1, x2, y2, distance);

        // Calculate line equation and extract slope and intercept
        double[] line = getLineEquation(x1, y1, x2, y2);
        double m = line[0];
        double b = line[1];

        // Print line equation, handle vertical lines separately
        if (Double.isInfinite(m)) {
            System.out.printf("The line is vertical: x = %.2f\n", x1);
        } else {
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", m, b);
        }
    }
}
