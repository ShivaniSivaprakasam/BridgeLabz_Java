package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;
public class ArrayCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array of numbers: ");
        int[] number = new int[5];
        for ( int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
        }
        System.out.print("Array of numbers are: ");
        for ( int i = 0; i < 5; i++) {
            System.out.println(number[i] + " ");
        }
        for ( int i = 0; i < number.length; i++) {
            if ( number[i] > 0 ) {
                System.out.println(number[i] + " is Positive.");
                if ( number[i] % 2 == 0 ) {
                    System.out.println(number[i] + " is even.");
                }
                else {
                    System.out.println(number[i] + " is odd.");
                }
            }
            else if ( number[i] < 0 ){
                System.out.println(number[i] + " is Negative.");
            }
            else{
                System.out.println(number[i] + " is Zero.");
            }
        }
        for ( int i = 1; i < number.length; i++ ) {
            if ( number[0] > number[number.length - 1] ) {
                System.out.println(number[0] + " is largest.");
                break;
            }
            else if ( number[0] < number[number.length - 1] ) {
                System.out.println(number[0] + " is smallest.");
                break;
            }
            else{
                System.out.println(number[0] +" and " +number[number.length - 1] + " are equal.");
                break;
            }
        }
    }
}

