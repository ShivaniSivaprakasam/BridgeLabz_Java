package coreprogramming.javamethods.level2;

import java.util.Scanner;

public class QuadraticFormula {

    /**
     * Calculates the real roots of a quadratic equation ax^2 + bx + c = 0
     * Returns:
     * - 2-element array if two real roots
     * - 1-element array if one real root
     * - empty array if no real roots
     */
    public static double[] quadraticFormula(double a, double b, double c) {

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};

        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        return new double[0]; // No real roots
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        while (true) {
            System.out.print("Enter value of a (non-zero): ");
            a = input.nextDouble();
            if (a != 0) break;
            System.out.println("Coefficient 'a' cannot be 0. Try again.");
        }

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        double[] roots = quadraticFormula(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots exist for the given equation.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }

        input.close();
    }
}
