package coreprogramming.javamethods.level3;

import java.util.Random;

/*
 * StudentGrade class
 * ------------------
 * This class simulates student score generation and calculates:
 * 1. Total marks for each student.
 * 2. Average marks.
 * 3. Percentage (out of 300).
 * It also displays a formatted scorecard for all students.
 */
public class StudentGrade {

    // Generate random scores (50-100) for Physics, Chemistry, and Math for each student
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // [Physics, Chemistry, Math]

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50; // Physics
            scores[i][1] = rand.nextInt(51) + 50; // Chemistry
            scores[i][2] = rand.nextInt(51) + 50; // Math
        }

        return scores;
    }

    // Calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // [Total, Average, Percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print((int)results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "%");
            System.out.println();
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int numStudents = 5;                       // Number of students

        int[][] scores = generateScores(numStudents);            // Generate random scores
        double[][] results = calculateTotalAveragePercentage(scores); // Calculate total, average, percentage
        displayScorecard(scores, results);                        // Display scorecard
    }
}
