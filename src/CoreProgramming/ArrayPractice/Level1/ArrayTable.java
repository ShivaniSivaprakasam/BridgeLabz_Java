package CoreProgramming.ArrayPractice.Level1;
import java.util.Scanner;
public class ArrayTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for which the multiplication table is needed: ");
        int number = input.nextInt();
        int[] table = new int[4];
        int value = 0;
        for ( int i = 6; i <= 9; i ++ ){
            table[value] = number*i;
            value++;
        }
        System.out.print("The array with multiplication table from 9 to 6 is: ");
        for ( int i = 0; i <= table.length - 1; i ++ ){
            System.out.print(table[i] + " ");
        }
    }
}

