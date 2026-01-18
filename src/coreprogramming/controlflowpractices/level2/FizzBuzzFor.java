package coreprogramming.controlflowpractices.level2;
import java.util.Scanner;
public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int number =  input.nextInt();
        int i = 1;
        // Condition to check if the number is greater than 1
        while (i <= number) {
            // Condition to check divisibility by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
            // Incrementing i
            i++;
        }
    }
}
