package CoreProgramming.JavaMethods.Level2;
import java.util.Scanner;
public class BMI {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] persons = new double[10][3];

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            persons[i][0] = input.nextDouble();

            System.out.print("Enter height (cm): ");
            persons[i][1] = input.nextDouble();
        }

        calculateBMI(persons);

        String[] status = getBMIStatus(persons);

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    persons[i][1],
                    persons[i][0],
                    persons[i][2],
                    status[i]);
        }

    }
}

