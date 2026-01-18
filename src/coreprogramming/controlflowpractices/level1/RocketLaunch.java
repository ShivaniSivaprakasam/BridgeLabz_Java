package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class RocketLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Setting while loop to get values greater than 1
        while ( number < 1){
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
        }
        // Initialization of for loop to start count down
        for ( int i = number; i >= 1; i-- ){
            System.out.println("Countdown: " +i);
        }
        System.out.println("Launch the rocket");
    }
}
