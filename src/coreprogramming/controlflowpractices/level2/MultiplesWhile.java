package coreprogramming.controlflowpractices.level2;
import  java.util.Scanner;
public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Setting condition to get onlu number between 0 and 100
        while ( number > 100 || number < 0 ) {
            System.out.print("Enter a number less than 100 and should also be positive: ");
            number = input.nextInt();
        }
        int counter = number - 1;
        // Setting condition to get counter value more than 1
        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            // Decrementing counter
            counter--;
        }
    }
}
