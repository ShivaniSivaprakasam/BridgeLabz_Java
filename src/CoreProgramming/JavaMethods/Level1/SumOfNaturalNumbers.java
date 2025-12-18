package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int naturalSum( int N ){
       int sum = 0;
       for ( int i = 0; i <= N; i++ ){
           sum = sum + i;
       }
       return sum;
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number: ");
       int N = input.nextInt();
       int sumNumber = naturalSum(N);
       System.out.println("The sum of " +N +" natural number is: " +sumNumber);
   }

}
