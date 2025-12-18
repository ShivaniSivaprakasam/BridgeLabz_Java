package CoreProgramming.JavaMethods.Level3;
import java.util.Scanner;

public class NumberCheck1 {

    public static int digitCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] digitArray(int count, int number) {
        int[] digit = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digit[i] = number % 10;
            number /= 10;
        }
        return digit;
    }

    public static boolean duckNUmber(int[] digit) {
        for (int i = 0; i < digit.length; i++) {
            if (digit[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean armstrongNumber(int[] digit, int number) {
        int sum = 0;
        int power = digit.length;
        for (int d : digit) {
            sum += (int) Math.pow(d, power);
        }
        return sum == number;
    }

    public static int[] largestElement(int[] digit) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digit) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestElement(int[] digit) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digit) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d > smallest && d < secondSmallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int count = digitCount(number);
        int[] digits = digitArray(count, number);

        System.out.println("Duck Number: " + duckNUmber(digits));
        System.out.println("Armstrong Number: " + armstrongNumber(digits, number));

        int[] max = largestElement(digits);
        System.out.println("Largest: " + max[0] + ", Second Largest: " + max[1]);

        int[] min = smallestElement(digits);
        System.out.println("Smallest: " + min[0] + ", Second Smallest: " + min[1]);
    }
}
