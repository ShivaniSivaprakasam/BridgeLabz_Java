package CoreProgramming.ControlFlowPractices.Level2;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =  input.nextInt();
        if ( number > 0 ){
            if (number % 3 == 0 && number % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (number % 5 == 0){
                System.out.println("Buzz");
            }
            else if (number % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(number + " is positive.");
            }
        }
        else if ( number < 0 ){
            System.out.println(number + " is negative.");
        }
        else{
            System.out.println(number + " is zero.");
        }
    }
}
