package CoreProgramming.ArrayPractice.Level2;
import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxDigit = 10;
        int[] digit =  new int[maxDigit];
        int index = 0;
        while ( number != 0 ){
            digit[index] = number % 10;
            number = number / 10;
            index++;
            if ( index == maxDigit ){
                break;
            }
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0 ; i < index ; i++){
            if ( digit[i] > largest ){
                secondLargest = largest;
                largest = digit[i];
            }
            else if ( digit[i] > secondLargest && digit[i] != largest){
                secondLargest = digit[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
