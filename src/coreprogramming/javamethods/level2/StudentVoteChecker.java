package coreprogramming.javamethods.level2;

import java.util.Scanner;

/*
 * StudentVoteChecker class
 * ------------------------
 * This class checks whether students are eligible to vote based on their age.
 * It includes:
 * 1. canStudentVote(int age): Returns true if age is 18 or above, false otherwise.
 * 2. main(): Prompts the user to enter ages for 10 students and prints
 *    whether each student can vote or not.
 */
public class StudentVoteChecker {

    // Method to check if a student is eligible to vote
    public boolean canStudentVote(int age) {

        if (age < 0) { // Age cannot be negative
            return false;
        }

        return age >= 18; // Eligible if age is 18 or more
    }

    // Main method to demonstrate the voting eligibility check
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input
        StudentVoteChecker checker = new StudentVoteChecker(); // Create object of StudentVoteChecker

        int[] ages = new int[10]; // Array to store ages of 10 students

        // Loop to get input and check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": "); // Prompt user for input
            ages[i] = input.nextInt(); // Read age from user

            boolean canVote = checker.canStudentVote(ages[i]); // Check eligibility

            // Print result based on eligibility
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}
