package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class IntegerNumber {
    public static void integerNum ( int number ){
       if ( number > 0 ){
           System.out.println("The number entered is positive.");
       }
       else if ( number < 0 ){
           System.out.println("The number entered is negative.");
       }
       else{
           System.out.println("The number entered is zero.");
       }
   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number: ");
       int number = input.nextInt();
       integerNum( number );
   }

}
