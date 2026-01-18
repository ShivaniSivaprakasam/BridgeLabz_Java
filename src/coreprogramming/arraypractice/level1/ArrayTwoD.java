package coreprogramming.arraypractice.level1;
import java.util.Scanner;
public class ArrayTwoD {
    public static void main(String[] args) {
        // Getting input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        // Input for number of rows
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        // Input for number of columns
        int columns = input.nextInt();
        // Initialization of a 2D array
        int[][] arr = new int[rows][columns];
        // Initialization of a 1D array
        int[] array = new int[rows*columns];
        // Adding input to the 2D array
        System.out.print("Enter elements of the 2D array: ");
        for ( int i = 0; i < rows; i++){
            for ( int j = 0; j < columns; j++ ){
                arr[i][j] = input.nextInt();
            }
        }
        // Displaying the elements of the 2D array
        System.out.println("The elements of the 2d array is: ");
        for ( int i = 0; i < rows; i++){
            for ( int j = 0; j < columns; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Converting 2D to 1D array
        int index = 0;
        for ( int i = 0; i <rows; i++){
            for ( int j = 0; j < columns; j++ ){
                array[index] = arr[i][j];
                index++;
            }
        }
        // Displaying elements of the 1D array
        System.out.println("The 1D array is: ");
        for ( int i = 0; i < rows*columns; i++){
            System.out.print(array[i] + " ");
        }
    }
}
