package coreprogramming.controlflowpractices.level2;
import  java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;
        // Setting while conditions to get value greater than 1
        while ( counter >= 1 ){
            // Loop condition to get greatest factor
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        // Dispalying result
        System.out.println("Greatest factor: " + greatestFactor);
    }
}
