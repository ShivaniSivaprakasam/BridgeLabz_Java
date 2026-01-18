package coreprogramming.controlflowpractices.level3;

import java.util.Scanner;

public class AverageMarks {

    /*
     * This program calculates the average marks of a student in Physics, Chemistry, and Maths.
     * Based on the average, it assigns a grade according to agency-normalized standards.
     * The program demonstrates user input, arithmetic operations, and conditional statements in Java.
     */

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user and read Physics marks
        System.out.print("Enter physics marks: ");
        float physics = input.nextFloat();

        // Prompt the user and read Chemistry marks
        System.out.print("Enter chemistry marks: ");
        float chemistry = input.nextFloat();

        // Prompt the user and read Maths marks
        System.out.print("Enter maths marks: ");
        float math = input.nextFloat();

        // Calculate the average marks
        float average = (physics + chemistry + math) / 3;

        // Determine the grade based on average marks using conditional statements
        if (average >= 80) {
            // Grade A: Level 4, above agency-normalized standards
            System.out.println("Grade: A; Level 4, above agency-normalized standards");
        } 
        else if (average >= 70 && average <= 79) {
            // Grade B: Level 3, at agency-normalized standards
            System.out.println("Grade: B; Level 3, at agency-normalized standards");
        } 
        else if (average >= 60 && average <= 69) {
            // Grade C: Level 2, below but approaching agency-normalized standards
            System.out.println("Grade: C; Level 2, below, but approaching agency-normalized standards");
        } 
        else if (average >= 50 && average <= 59) {
            // Grade D: Level 1, well below agency-normalized standards
            System.out.println("Grade: D; Level 1, well below agency-normalized standards");
        } 
        else if (average >= 40 && average <= 49) {
            // Grade E: Level 1-, too below agency-normalized standards
            System.out.println("Grade: E; Level 1-, too below agency-normalized standards");
        } 
        else {
            // Grade R: Remedial standards
            System.out.println("Grade: R; Remedial standards");
        }
    }
}
