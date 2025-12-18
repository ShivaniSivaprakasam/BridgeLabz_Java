package CoreProgramming.ArrayPractice.Level2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of people in a team: ");
        int people = input.nextInt();
        double[] weight =  new double[people];
        double[] height =  new double[people];
        double[] BMI =  new double[people];
        String[] weightStatus  = new String[people];
        for ( int i = 0; i < people; i++) {
            System.out.println("Enter details of person" + (i + 1));
            System.out.print("Enter weight of each people in the team: ");
            weight[i] = input.nextDouble();
            System.out.print("Enter height of each people in the team: ");
            height[i] = input.nextDouble();
        }
        System.out.println("Weight array: ");
        for ( int i = 0; i < people; i++) {
            System.out.print(weight[i] + " ");
        }
        System.out.println("\nHeight array: ");
        for ( int i = 0; i < people; i++) {
            System.out.print(height[i] + " ");
        }
        for (int i = 0; i < people; i++) {
            BMI[i] = weight[i] / (height[i] * height[i]);

            if (BMI[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (BMI[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (BMI[i] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < people; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    height[i], weight[i], BMI[i], weightStatus[i]);
        }
    }
}
