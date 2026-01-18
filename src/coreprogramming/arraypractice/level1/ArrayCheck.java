package coreprogramming.arraypractice.level1;
import java.util.Scanner;
public class ArrayCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting input from user for array size
        System.out.print("Enter array of numbers: ");
        int[] number = new int[5];
        // Getting input for array elements
        for ( int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
        }
        // Displaying elements of the array
        System.out.print("Array of numbers are: ");
        for ( int i = 0; i < 5; i++) {
            System.out.println(number[i] + " ");
        }
        // Checking if the array elements is even/odd/negative/zero
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
        // Finding out the largest, smallest and equal elements
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

