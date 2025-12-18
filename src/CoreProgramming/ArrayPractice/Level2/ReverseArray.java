package CoreProgramming.ArrayPractice.Level2;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int length = (int) Math.log10(number) + 1;
        int[] arr = new int[length]; int index = 0;
        for ( int i = 0; i < length; i++ ){
            arr[index] = number % 10;
            number = number / 10;
            index++;
        }
        System.out.println("The reverse array is: ");
        for ( int i = 0; i < length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}

