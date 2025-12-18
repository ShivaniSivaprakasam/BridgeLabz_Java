package CoreProgramming.JavaMethods.Level3;
import java.util.Scanner;
public class collinear {

    public static boolean isCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {

        double slopeAB, slopeBC, slopeAC;

        if (x2 - x1 != 0) {
            slopeAB = (y2 - y1) / (x2 - x1);
        } else {
            slopeAB = Double.POSITIVE_INFINITY;
        }

        if (x3 - x2 != 0) {
            slopeBC = (y3 - y2) / (x3 - x2);
        } else {
            slopeBC = Double.POSITIVE_INFINITY;
        }

        if (x3 - x1 != 0) {
            slopeAC = (y3 - y1) / (x3 - x1);
        } else {
            slopeAC = Double.POSITIVE_INFINITY;
        }

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean isCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
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
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (checked by slope).");
        } else {
            System.out.println("The points are NOT collinear (checked by slope).");
        }

        if (isCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (checked by area of triangle).");
        } else {
            System.out.println("The points are NOT collinear (checked by area of triangle).");
        }
    }
}
