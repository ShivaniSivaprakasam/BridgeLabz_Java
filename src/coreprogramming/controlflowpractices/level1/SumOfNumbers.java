package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Condition to get only natural number
        if ( number <= 0){
            System.out.println("The number " +number +" is not a natural number.");
            return;
        }
        int sum = 0;
        // Getting sum of natural number
        for ( int i = 1; i <= number; i++){
            sum = number * (number + 1) / 2;
        }
        System.out.println("The sum of " + number + " natural numbers is " +sum +".");
    }
}

