package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class SumToNegative {
    public static void main(String[] args) {
        // Getting user inpu
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        // Setting condition to get only natural number
        while (true) {
            System.out.print("Enter number: ");
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            total = total + value;
            System.out.println("The sum is: " + total);
        }
        // Displaying results
        System.out.println("The sum achieved before reaching zero or a negative number is: " + total);
        System.out.println("The user has entered zero or a negative number");
    }
}

