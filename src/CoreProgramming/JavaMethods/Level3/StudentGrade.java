package CoreProgramming.JavaMethods.Level3;
import java.util.Random;
public class StudentGrade {

    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // [][0]=Physics, [][1]=Chemistry, [][2]=Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50; // 50-100
            scores[i][1] = rand.nextInt(51) + 50;
            scores[i][2] = rand.nextInt(51) + 50;
        }

        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

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

    public static void main(String[] args) {
        int numStudents = 5;

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateTotalAveragePercentage(scores);
        displayScorecard(scores, results);
    }
}
