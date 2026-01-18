package coreprogramming.controlflowpractices.level2;
import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        System.out.print("Enter a power: ");
        int power = scan.nextInt();
        // Setting condition to get positive number
        while (number < 0) {
            System.out.print("Enter a positive number: ");
            number = scan.nextInt();
        }
        int result = 1;
        int counter = 0;
        // Condition to get power of a number
        while ( counter < power ){
            result = number * result;
            counter++;
        }
        // Displaying results
        System.out.println(result);
    }
}
