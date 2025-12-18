package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;
public class MultipleElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        double total = 0.0;
        int index = 0;
        while(true){
            System.out.print("Enter an number: ");
            double number = input.nextDouble();
            if ( number <= 0 ){
                System.out.println("The number should be greater then zero.");
                break;
            }
            if ( index == 10 ){
                System.out.println("The array has reached maximum size.");
                break;
            }
            array[index] = number;
            index++;
        }
        System.out.println("The elements of the array are: ");
        for ( int i = 0; i < index; i++ ){
            System.out.print(array[i] + " ");
            total = total + array[i];
        }
        System.out.println("\nThe total is: " + total);
    }
}

