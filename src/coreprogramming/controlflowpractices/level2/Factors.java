package coreprogramming.controlflowpractices.level2;
import java.util.Scanner;
public class Factors {
    // Creating a method to find factors of a number
    public static void findingFactors(int N){
        while ( N < 0 ) {
            System.out.print("Enter a positive integer: ");
            N = new Scanner(System.in).nextInt();
        }
        for ( int i = 1; i <= N; i++ ){
            if ( N % i == 0 ){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        // Calling method
        findingFactors(N);
    }
}
