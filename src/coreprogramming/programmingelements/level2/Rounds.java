package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program calculates the total number of rounds
 * an athlete will run to complete 5 km based on
 * the lengths of three sides of a track.
 */
public class Rounds {

    public static void main(String[] args) {

        // Taking the lengths of three sides of the track from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side: ");
        float side1 = input.nextFloat();

        System.out.print("Enter second side: ");
        float side2 = input.nextFloat();

        System.out.print("Enter third side: ");
        float side3 = input.nextFloat();

        // Calculating the perimeter of the track
        float perimeter = side1 + side2 + side3;

        // Calculating the total number of rounds to complete 5 km
        float rounds = 5 / perimeter;

        // Displaying the result
        System.out.println("The total number of rounds the athlete will run is " +
                rounds + " to complete 5 km.");
    }
}
