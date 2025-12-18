package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        String[] fizzBuzz =  new String[number + 1];
        for ( int i = 1; i <= number; i++ ){
            if  (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz[i] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                fizzBuzz[i] = "Fizz";
            }
            else if (i % 5 == 0) {
                fizzBuzz[i] = "Buzz";
            }
            else {
                fizzBuzz[i] = String.valueOf(i);
            }
        }
        System.out.print("The result is: ");
        for ( int i = 1; i <= number; i++ ){
            System.out.println("Position " + i + " = " + fizzBuzz[i]);
        }
        System.out.print("The result array is: ");
        for ( int i = 1; i <= number; i++ ){
            System.out.print(fizzBuzz[i] + " ");
        }

    }
}
