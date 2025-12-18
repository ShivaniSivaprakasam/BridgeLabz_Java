package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
public class SumToZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        double value = input.nextDouble();
        double total = 0.0;
        while ( value > 0){
            total = total + value;
            System.out.println("The sum is: " +total);
            System.out.print("Enter number: ");
            value = input.nextDouble();
        }
        System.out.println("The sum achieved before reaching zeros is: " +total);
        System.out.println("The user has entered zero");
    }
}
