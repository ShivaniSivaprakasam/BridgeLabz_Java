package CoreProgramming.ControlFlowPractices.Level1;
import java.util.Scanner;
public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while (number <= 0) {
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
