package CoreProgramming.JavaMethods.Level1;
import java.util.Scanner;
public class HandShakes {
    public static float handShake( int n ){
        float combination = ( n * ( n - 1 ) ) / 2;
        return combination;
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number of students: ");
       int n = input.nextInt();
       float handShakes = handShake(n);
       System.out.println("The number of possible handshakes is: " +handShakes);
   }
}

