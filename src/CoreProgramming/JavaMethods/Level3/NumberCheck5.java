package CoreProgramming.JavaMethods.Level3;
import java.util.Scanner;
public class NumberCheck5  {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static boolean perfectNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum == number;
    }

    public static boolean abundantNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum > number;
    }

    public static boolean deficientNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) {
                sum += f;
            }
        }
        return sum < number;
    }

    public static boolean strongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        System.out.println("Is Perfect Number: " + perfectNumber(number, factors));
        System.out.println("Is Abundant Number: " + abundantNumber(number, factors));
        System.out.println("Is Deficient Number: " + deficientNumber(number, factors));
        System.out.println("Is Strong Number: " + strongNumber(number));
    }
}
