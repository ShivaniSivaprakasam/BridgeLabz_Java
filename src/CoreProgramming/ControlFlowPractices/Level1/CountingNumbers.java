package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        while ( number <= 0 ){
            System.out.print("Enter a number greater than zero: ");
            number = input.nextInt();
        }
        int sum = 0;
        while ( number > 0){
            sum = number * (number + 1) /2;
            break;
        }
        System.out.println("The sum of " +number +" numbers is: " +sum +".");
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
