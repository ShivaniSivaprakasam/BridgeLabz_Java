package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/**
 * This program calculates the area of a triangle given its base and height.
 * It also converts the height from centimeters to inches and feet, and displays all results.
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Get base from user
        System.out.print("Enter the base of the triangle (cm): ");
        double baseCm = scanner.nextDouble();

        // Get height from user
        System.out.print("Enter the height of the triangle (cm): ");
        double heightCm = scanner.nextDouble();

        // Calculate area
        double areaCm2 = (baseCm * heightCm) / 2;
        System.out.printf("The area of the triangle is: %.2f cm²%n", areaCm2);

        // Convert height to inches and feet
        double heightInches = heightCm / 2.54;
        double heightFeet = heightInches / 12;

        System.out.printf("Height: %.2f cm, %.2f ft, %.2f in%n", heightCm, heightFeet, heightInches);
    }
}
