package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;

public class FactorArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxFactor = 10;
        int[] factor = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {


                if (index == maxFactor) {
                    int newSize = maxFactor * 2;
                    int[] temp = new int[newSize];

                    for (int j = 0; j < factor.length; j++) {
                        temp[j] = factor[j];
                    }

                    factor = temp;
                    maxFactor = newSize;
                }

                factor[index] = i;
                index++;
            }
        }

        System.out.print("The array of factors is: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factor[i] + " ");
        }
    }
}