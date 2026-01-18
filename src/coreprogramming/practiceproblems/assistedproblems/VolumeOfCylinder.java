package coreprogramming.practiceproblems.assistedproblems;

import java.util.Scanner;

/**
 * VolumeOfCylinder class
 * ----------------------
 * This program calculates the volume of a cylinder based on user-provided
 * radius and height.
 */
public class VolumeOfCylinder {

    public static void main(String[] args) {
        final double PI = 3.14; // Approximation of π

        Scanner input = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        // Prompt user for height
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();

        // Calculate volume: V = π * r^2 * h
        double volume = PI * Math.pow(radius, 2) * height;

        // Display the result
        System.out.println("The volume of the cylinder is: " + volume + " cm^3.");
    }
}
