package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class SumToZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter number: ");
        double value = input.nextDouble();
        double total = 0.0;
        // Setting the loop to get values greater than zero
        while ( value > 0){
            total = total + value;
            System.out.println("The sum is: " +total);
            System.out.print("Enter number: ");
            value = input.nextDouble();
        }
        // Displaying results
        System.out.println("The sum achieved before reaching zeros is: " +total);
        System.out.println("The user has entered zero");
    }
}
