package CoreProgramming.ArrayPractice.Level2;
import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] > 0) {
                    break;
                }
                System.out.println("Invalid weight! Enter a positive value.");
            }

            while (true) {
                System.out.print("Enter height (meters): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Invalid height! Enter a positive value.");
            }
        }

        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height); // BMI

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    personData[i][1],
                    personData[i][0],
                    personData[i][2],
                    weightStatus[i]);
        }

        input.close();
    }
}
