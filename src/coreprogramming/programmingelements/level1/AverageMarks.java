package coreprogramming.programmingelements.level1;

/**
 * This program calculates the average marks of a student in three subjects: Maths, Physics, and Chemistry.
 * It computes the average and displays the result.
 */
public class AverageMarks {

    public static void main(String[] args) {
        // Marks in each subject
        double mathsMarks = 94;
        double physicsMarks = 95;
        double chemistryMarks = 96;

        // Calculate average
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3;

        // Display result
        System.out.printf("Sam's average marks in PCM is: %.2f%n", averageMarks);
    }
}
