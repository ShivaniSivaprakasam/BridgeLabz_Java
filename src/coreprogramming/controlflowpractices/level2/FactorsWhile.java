package coreprogramming.controlflowpractices.level2;
import java.util.Scanner;
public class FactorsWhile {
    // Created method to find factors
    public static void findingFactors(int N){
        // Setting loop condition to only positive numbers
        while ( N < 0 ) {
            System.out.print("Enter a positive integer: ");
            N = new Scanner(System.in).nextInt();
        }
        int count = 0;
        // Setting conditions to count number
        while ( count < N ){
            count++;
            if ( N % count == 0 ){
                System.out.println( count );
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        // Calling the method
        findingFactors(N);
    }
}
