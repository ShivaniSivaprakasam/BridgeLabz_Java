package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Initialization of loop to determine the sign of the number
        if ( number > 0 ){
            System.out.println("Positive.");
        }
        else if ( number < 0 ){
            System.out.println("Negative.");
        }
        else{
            System.out.println("Zero.");
        }
    }
}
