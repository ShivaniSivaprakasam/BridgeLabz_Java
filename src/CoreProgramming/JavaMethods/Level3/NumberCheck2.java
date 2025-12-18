package CoreProgramming.JavaMethods.Level3;
import java.util.Scanner;
public class NumberCheck2 {
    public static int digitCount(int number){
        int count = 0;
        while ( number > 0){
            count ++;
            number /= 10;
        }
        return count;
    }
    public static int[] digitArray(int number, int count){
        int[] digit = new int[count];
        for ( int i = count - 1; i >= 0; i-- ){
            digit[i] = number % 10;
            number /= 10;
        }
        return digit;
    }
    public static int sumArray(int[] array){
        int sum = 0;
        for ( int i = 0; i < array.length; i++ ){
            sum += array[i];
        }
        return sum;
    }
    public static int squareArray(int[] array){
        int square = 0;
        for ( int a : array ){
            square += (int) Math.pow(a, 2);
        }
        return square;
    }
    public static boolean harshadNumber(int[] array, int number){
        int sum = 0;
        for ( int a : array ){
            sum += a;
        }
        if ( number % sum == 0 ){
            return true;
        }
        return false;
    }
    public static int[][] digitFrequency(int[] array){
        int[][] frequency = new int[10][2];
        for ( int i = 0; i < 10; i++ ){
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for ( int a: array ){
            frequency[a][1]++;
        }
        return frequency;
    }
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int count = digitCount(number);
        int[] digit = digitArray(number, count);
        System.out.println("Is the number a harshad number: " +harshadNumber(digit, number));
        System.out.println("Square sum of number: "+squareArray(digit));
        System.out.println("Sum of number: "+sumArray(digit));
        int[][] freq = digitFrequency(digit);
        System.out.println("Digit  Frequency");
        for (int i = 0; i < freq.length; i++){
            if (freq[i][1] > 0){
                System.out.println(freq[i][0] + "        " + freq[i][1]);
            }
        }
    }
}
