package coreprogramming.stringfunction.level2;

import java.util.Scanner;

/*
 * This program generates a score card for students in Physics, Chemistry, and Maths.
 * It calculates total, average, percentage, assigns grades, and displays the score card.
 */
public class StudentGradeCard {

    /*
     * Generates random scores (0-99) for Physics, Chemistry, and Maths for each student
     */
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 100); // Physics
            scores[i][1] = (int) (Math.random() * 100); // Chemistry
            scores[i][2] = (int) (Math.random() * 100); // Maths
        }
        return scores;
    }

    /*
     * Calculates total, average, and percentage for each student
     */
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total; // Total marks
            result[i][1] = Math.round(average * 100.0) / 100.0; // Rounded average
            result[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded percentage
        }
        return result;
    }

    /*
     * Assigns grade based on percentage
     * A: 80+, B: 70-79, C: 60-69, D: 50-59, E: 40-49, R: <40
     */
    public static String[] calculateGrades(double[][] results) {
        int students = results.length;
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            double percent = results[i][2];

            if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else if (percent >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    /*
     * Displays the score card in a tabular format
     */
    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nScore Card");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Generate random scores
        int[][] scores = generatePCMScores(students);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Calculate grades
        String[] grades = calculateGrades(results);

        // Display score card
        displayScoreCard(scores, results, grades);
    }
}

