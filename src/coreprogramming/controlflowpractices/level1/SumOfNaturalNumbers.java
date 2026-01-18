package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class SumOfNaturalNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter number: ");
        int number = input.nextInt();
        if ( number <= 0){
            System.out.println("The number " +number +" is not a natural number.");
            return;
        }
        int sum = 0;
        // Setting user input to get sum of natural number
        for ( int i = 1; i <= number; i++){
            sum = number * (number + 1) / 2;
        }
        System.out.println("The sum of " + number + " natural numbers is " +sum +".");
        // Checking condition
        if ( number == sum ){
            System.out.println("The number is equal to the sum of " +number
                    +" numbers");
        }
        else{
            System.out.println("The number is not equal to the sum of " +number
                    +" numbers");
        }
    }
}
