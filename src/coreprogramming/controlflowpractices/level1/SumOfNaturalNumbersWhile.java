package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class SumOfNaturalNumbersWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Gettimg user input
        System.out.print("Enter number: ");
        int number = input.nextInt();
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
        // Checking the condition
        while ( number == sum ){
            System.out.println("The number is equal to the sum of " +number
                    +" numbers");
            break;
        }
        while ( number != sum ){
            System.out.println("The number is not equal to the sum of " +number
                    +" numbers");
            break;
        }
    }
}
