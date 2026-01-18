package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Setting while loop to get positive non-zero number
        while (number <= 0){
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
        }
        int factorial = 1;
        int i = 1;
        // Finding factorial
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}
