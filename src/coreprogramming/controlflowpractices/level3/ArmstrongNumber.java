package coreprogramming.controlflowpractices.level3;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        // Getting user input
       System.out.print("Enter number: ");
      int N = input.nextInt();
       int length = (int) Math.log10(N) + 1;
      System.out.println("The lenght of the given number is: " +length);
       int original = N;
      System.out.println("The original number is: " +original);
       int sum = 0;
        // Setting condition to get values more than zero
        while ( N > 0){
           int digit = N%10;
          sum += Math.pow(digit,length);
           N = N/10;
       }
        System.out.println("The sum of the given number is: " +sum);
        // Checking the condition
        if ( original == sum ){
           System.out.println("The given number is a armstrong number.");
       }
        else{
            System.out.println("The given number is not a armstrong number.");
       }
    }
}
