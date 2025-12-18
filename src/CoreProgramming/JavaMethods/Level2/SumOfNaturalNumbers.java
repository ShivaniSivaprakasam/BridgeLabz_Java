package CoreProgramming.JavaMethods.Level2;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int recursionSum ( int N ){
        if (N == 0) {
            return 0;
        }
        return N + recursionSum ( N - 1 );
    }
    public static int sumNumber ( int N ){
        int sum = N * ( N + 1 ) / 2;
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = input.nextInt();
        int result1 = recursionSum(N);
        int result2 = sumNumber(N);
        if ( result1 == result2 ){
            System.out.println("Both methods provide the same output.");
        }
        else{
            System.out.println("They provide different output.");
        }
    }

}
