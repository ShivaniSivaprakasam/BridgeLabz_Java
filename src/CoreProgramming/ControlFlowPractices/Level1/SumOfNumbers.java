package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        if ( number <= 0){
            System.out.println("The number " +number +" is not a natural number.");
            return;
        }
        int sum = 0;
        for ( int i = 1; i <= number; i++){
            sum = number * (number + 1) / 2;
        }
        System.out.println("The sum of " + number + " natural numbers is " +sum +".");
    }
}

