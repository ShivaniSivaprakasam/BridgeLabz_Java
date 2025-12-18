package CoreProgramming.ControlFlowPractices.Level3;
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number: ");
       int N = input.nextInt();
       int original = N;
       int sum = 0;
       while ( N > 0){
          int digit = N % 10;
          sum += digit;
           N = N/10;
       }
       if ( original % sum == 0){
           System.out.println("The given number is a harshad number");
       }
       else{
           System.out.println("The given number is not a harshad number");
       }
   }

}
