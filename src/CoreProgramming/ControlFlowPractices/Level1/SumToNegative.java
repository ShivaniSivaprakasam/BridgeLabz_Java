package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
public class SumToNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter number: ");
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            total = total + value;
            System.out.println("The sum is: " + total);
        }
        System.out.println("The sum achieved before reaching zero or a negative number is: " + total);
        System.out.println("The user has entered zero or a negative number");
    }
}

