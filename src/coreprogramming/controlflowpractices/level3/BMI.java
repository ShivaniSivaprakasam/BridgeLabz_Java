package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class BMI {

    /*
     * This program calculates the Body Mass Index (BMI) of a person.
     * BMI is calculated using the formula: weight (kg) / (height (m))^2.
     * Based on the BMI value, the program categorizes the user as:
     * underweight, normal-weight, overweight, or obese.
     * This program demonstrates user input, arithmetic operations, 
     * type conversion, and conditional statements in Java.
     */

    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in kilograms
        System.out.println("Enter weight in kg: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in centimeters
        System.out.println("Enter height in cm: ");
        double height = input.nextDouble();

        // Convert height from centimeters to meters
        double heightM = height / 100;

        // Calculate BMI using the formula: weight / (height in meters)^2
        double bmi = weight / (heightM * heightM);

        // Determine BMI category using conditional statements
        if (bmi <= 18.4) {
            // Underweight
            System.out.println("Your BMI is " + bmi + " hence you are underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            // Normal weight
            System.out.println("Your BMI is " + bmi + " hence you are normal-weight");
        } 
        else if (bmi >= 25 && bmi <= 39.9) {
            // Overweight
            System.out.println("Your BMI is " + bmi + " hence you are overweight");
        } 
        else {
            // Obese
            System.out.println("Your BMI is " + bmi + " hence you are obese");
        }
    }
}
