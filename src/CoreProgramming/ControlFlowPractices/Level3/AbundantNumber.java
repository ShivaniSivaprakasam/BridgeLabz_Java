package CoreProgramming.ControlFlowPractices.Level3;
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        int original = N;
        while (N < 0) {
            System.out.print("Enter a positive integer: ");
            N = input.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of divisors: " + sum);
        if (sum > original) {
            System.out.println("The given number is an abundant number");
        } else {
            System.out.println("The given number is not an abundant number");
        }
    }
}



