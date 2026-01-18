package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/*
 * This program converts height from centimeters to feet and inches.
 */
public class HeightConversion {

    public static void main(String[] args) {

        // Taking height input in centimeters
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Converting cm to inches and feet
        double inch = height / 2.54;
        double feet = inch / 12;

        // Displaying the converted values
        System.out.print("Your height in cm is " + height +
                " cm while in feet is " + feet +
                " ft and inches is " + inch + "″");
    }
}
