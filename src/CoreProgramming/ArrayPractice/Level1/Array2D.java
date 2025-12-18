package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];
        int[] array = new int[rows*columns];
        System.out.print("Enter elements of the 2D array: ");
        for ( int i = 0; i < rows; i++){
            for ( int j = 0; j < columns; j++ ){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The elements of the 2d array is: ");
        for ( int i = 0; i < rows; i++){
            for ( int j = 0; j < columns; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int index = 0;
        for ( int i = 0; i <rows; i++){
            for ( int j = 0; j < columns; j++ ){
                array[index] = arr[i][j];
                index++;
            }
        }
        System.out.println("The 1D array is: ");
        for ( int i = 0; i < rows*columns; i++){
            System.out.print(array[i] + " ");
        }
    }
}
