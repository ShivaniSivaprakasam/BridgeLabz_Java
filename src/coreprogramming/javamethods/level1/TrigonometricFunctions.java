package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class TrigonometricFunctions {

    /*
     * This method calculates sine, cosine, and tangent
     * of an angle given in degrees.
     *
     * Parameter:
     * - angle : angle in degrees
     *
     * Returns:
     * - double array containing {sine, cosine, tangent}
     */
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Read angle from user
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Calculate trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine of the angle: " + result[0]);
        System.out.println("Cosine of the angle: " + result[1]);
        System.out.println("Tangent of the angle: " + result[2]);
    }
}
