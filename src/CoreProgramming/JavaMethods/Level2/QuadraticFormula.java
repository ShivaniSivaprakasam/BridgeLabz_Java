package CoreProgramming.JavaMethods.Level2;
import java.util.Scanner;

public class QuadraticFormula {

    public static double[] quadraticFormula(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};

        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        return new double[0];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        double[] result = quadraticFormula(a, b, c);

        if (result.length == 0) {
            System.out.println("No real roots.");
        } else {
            System.out.print("The roots of x are: ");
            for (double r : result) {
                System.out.print(r + " ");
            }
        }
    }
}

