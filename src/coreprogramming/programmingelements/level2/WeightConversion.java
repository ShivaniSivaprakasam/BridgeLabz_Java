package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This program converts weight from pounds to kilograms.
 */
public class WeightConversion {

    public static void main(String[] args) {

        // Taking weight input in pounds from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weight = input.nextFloat();

        // Converting weight to kilograms
        double kg = weight * 2.2;

        // Displaying the weight in pounds and kilograms
        System.out.println("The weight of the person in pounds is " + weight +
                " lb and in kg is " + kg + " kg.");
    }
}

