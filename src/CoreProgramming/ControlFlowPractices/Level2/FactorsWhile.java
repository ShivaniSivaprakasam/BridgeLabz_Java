package CoreProgramming.ControlFlowPractices.Level2;
import java.util.Scanner;
public class FactorsWhile {
    public static void findingFactors(int N){
        while ( N < 0 ) {
            System.out.print("Enter a positive integer: ");
            N = new Scanner(System.in).nextInt();
        }
        int count = 0;
        while ( count < N ){
            count++;
            if ( N % count == 0 ){
                System.out.println( count );
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        findingFactors(N);
    }
}
