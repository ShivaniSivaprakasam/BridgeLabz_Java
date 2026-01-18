/**
 * Program Name: StudentVote
 *
 * Description:
 * This program accepts the ages of 10 students and determines
 * whether each student is eligible to vote or not.
 *
 * Eligibility Rule:
 * - Age must be 18 or above to vote
 *
 * The program also checks for invalid input (negative ages)
 * and displays appropriate messages.
 *
 * Concepts Used:
 * - Arrays
 * - Loops
 * - Conditional statements
 * - User input using Scanner
 */

package coreprogramming.ArrayPractice.Level1;

import java.util.Scanner;

public class StudentVote {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declaring an array to store the ages of 10 students
        int[] age = new int[10];

        // Prompting the user to enter ages
        System.out.print("Enter age of 10 students: ");

        // Loop to read age values into the array
        for (int i = 0; i < 10; i++) {

            // Storing each age entered by the user
            age[i] = input.nextInt();
        }

        // Displaying all entered ages
        for (int i = 0; i < 10; i++) {

            // Printing each student's age
            System.out.println(age[i] + " ");
        }

        // Loop to check voting eligibility
        for (int i = 0; i < 10; i++) {

            // Checking if the entered age is negative
            if (age[i] < 0) {

                // Displaying error message for negative age
                System.out.println("The number entered is negative.");
            }
            // Checking if the student is eligible to vote (age >= 18)
            else if (age[i] >= 18) {

                // Displaying eligibility message
                System.out.println("The student with age " + age[i] + " can vote.");
            }
            // Student is not eligible to vote (age < 18)
            else {

                // Displaying non-eligibility message
                System.out.println("The student with age " + age[i] + " cannot vote.");
            }
        }
    }
}
