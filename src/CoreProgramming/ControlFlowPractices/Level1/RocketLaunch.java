package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
public class RocketLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        while ( number < 1){
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
        }
        for ( int i = number; i >= 1; i-- ){
            System.out.println("Countdown: " +i);
        }
        System.out.println("Launch the rocket");
    }
}
