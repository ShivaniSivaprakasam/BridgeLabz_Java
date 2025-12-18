package CoreProgramming.ArrayPractice.Level2;
import java.util.Scanner;

public class ClassMarks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();

            System.out.print("Maths: ");
            maths[i] = input.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--;
            }
        }

        for (int i = 0; i < students; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n",
                    physics[i],
                    chemistry[i],
                    maths[i],
                    percentage[i],
                    grade[i]);
        }

        input.close();
    }
}
