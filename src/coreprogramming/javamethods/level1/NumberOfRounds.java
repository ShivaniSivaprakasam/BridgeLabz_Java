package coreprogramming.javamethods.level1;

import java.util.Scanner;

public class NumberOfRounds {

    /*
     * This method calculates how many rounds are needed
     * to complete a total distance of 5 km.
     *
     * Parameters:
     * - side1, side2, side3 : lengths of the three sides of the triangular track
     *
     * Returns:
     * - number of rounds required to complete 5 km
     */
    public static float rounds(float side1, float side2, float side3) {

        // Calculate the perimeter of the triangular track
        float perimeter = side1 + side2 + side3;

        // Total distance to be covered (5 km = 5000 meters assumed here)
        // If sides are in km, then 5 represents 5 km
        float rounds = 5 / perimeter;

        // Return calculated number of rounds
        return rounds;
    }

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read first side length
        System.out.print("Enter first side: ");
        float side1 = input.nextFloat();

        // Read second side length
        System.out.print("Enter second side: ");
        float side2 = input.nextFloat();

        // Read third side length
        System.out.print("Enter third side: ");
        float side3 = input.nextFloat();

        // Call method to calculate number of rounds
        float runningRounds = rounds(side1, side2, side3);

        // Display the result
        System.out.println(
                "The number of rounds needed to complete a 5 km run is: " + runningRounds
        );
    }
}
