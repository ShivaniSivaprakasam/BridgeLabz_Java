package coreprogramming.controlflowpractices.level1;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while (number <= 0){
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
        }
        int countEven = 0;
        int countOdd = 0;
        // Setting loop condition to check for even number
        for (int i = 1; i <= number; i++){
            if ( i % 2 == 0 ){
                System.out.println(i + " Even");
                countEven++;
            }
            else{
                System.out.println(i + " Odd");
                countOdd++;
            }
        }
        // Displaying results
        System.out.println("The count of even numbers found in number from 1 to " +number +" are: " + countEven);
        System.out.println("The count of odd numbers found in number from 1 to " +number +" are: " + countOdd);
    }
}
