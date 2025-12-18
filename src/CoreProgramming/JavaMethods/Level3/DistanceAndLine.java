package CoreProgramming.JavaMethods.Level3;
import java.util.Scanner;
public class DistanceAndLine {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double m;
        double b;

        if (x2 - x1 != 0) {
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        } else {
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN;
        }

        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between (%.2f, %.2f) and (%.2f, %.2f) = %.2f\n",
                x1, y1, x2, y2, distance);

        double[] line = getLineEquation(x1, y1, x2, y2);
        double m = line[0];
        double b = line[1];

        if (Double.isInfinite(m)) {
            System.out.printf("The line is vertical: x = %.2f\n", x1);
        } else {
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", m, b);
        }
    }
}

