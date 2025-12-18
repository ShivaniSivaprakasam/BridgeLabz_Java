package CoreProgramming.ControlFlowPractices.Level3;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        int count = 0;
            while ( N != 0){
                N = N / 10;
                count++;
            }
        System.out.println(count);
    }
}
