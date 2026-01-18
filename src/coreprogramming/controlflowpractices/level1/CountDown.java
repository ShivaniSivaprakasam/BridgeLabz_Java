package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class CountDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Setting while loop condition
        while ( number < 1){
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
        }
        while ( number >= 1 ){
            System.out.println("The countdown: " +number);
            number--;
        }
        // Printing result
        System.out.println("Launch the rocket");
    }
}
