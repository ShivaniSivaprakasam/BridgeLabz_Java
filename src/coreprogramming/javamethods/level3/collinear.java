package coreprogramming.javamethods.level3;

import java.util.Scanner;

/**
 * Collinear class
 * ------------------
 * This program checks whether three points are collinear using two methods:
 * 1. By comparing slopes
 * 2. By calculating the area of the triangle formed by the points
 */
public class Collinear {

    // Check collinearity using slopes
    public static boolean isCollinearBySlope(double x1, double y1,
                                             double x2, double y2,
                                             double x3, double y3) {

        double slopeAB = (x2 - x1 != 0) ? (y2 - y1) / (x2 - x1) : Double.POSITIVE_INFINITY;
        double slopeBC = (x3 - x2 != 0) ? (y3 - y2) / (x3 - x2) : Double.POSITIVE_INFINITY;
        double slopeAC = (x3 - x1 != 0) ? (y3 - y1) / (x3 - x1) : Double.POSITIVE_INFINITY;

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Check collinearity using area of triangle
    public static boolean isCollinearByArea(double x1, double y1,
                                            double x2, double y2,
                                            double x3, double y3) {
        // Area formula: 0.5 * | x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2) |
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        // Check using slopes
        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (checked by slope).");
        } else {
            System.out.println("The points are NOT collinear (checked by slope).");
        }

        // Check using area
        if (isCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (checked by area of triangle).");
        } else {
            System.out.println("The points are NOT collinear (checked by area of triangle).");
        }
    }
}
