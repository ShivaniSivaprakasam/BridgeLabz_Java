package CoreProgramming.JavaMethods.Level3;
import java.util.Random;
public class Matrix {

    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // 1-10
        return matrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = B[0].length, n = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static double[][] transposeMatrix(double[][] A) {
        int rows = A.length, cols = A[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = A[i][j];
        return transposed;
    }

    public static double determinant2x2(double[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    public static double determinant3x3(double[][] A) {
        return A[0][0] * (A[1][1]*A[2][2] - A[1][2]*A[2][1])
                - A[0][1] * (A[1][0]*A[2][2] - A[1][2]*A[2][0])
                + A[0][2] * (A[1][0]*A[2][1] - A[1][1]*A[2][0]);
    }

    public static double[][] inverse2x2(double[][] A) {
        double det = determinant2x2(A);
        if (det == 0) return null;
        double[][] inv = {
                { A[1][1]/det, -A[0][1]/det },
                { -A[1][0]/det, A[0][0]/det }
        };
        return inv;
    }

    public static double[][] inverse3x3(double[][] A) {
        double det = determinant3x3(A);
        if (det == 0) return null;

        double[][] adj = new double[3][3];

        adj[0][0] =  (A[1][1]*A[2][2] - A[1][2]*A[2][1]);
        adj[0][1] = -(A[0][1]*A[2][2] - A[0][2]*A[2][1]);
        adj[0][2] =  (A[0][1]*A[1][2] - A[0][2]*A[1][1]);

        adj[1][0] = -(A[1][0]*A[2][2] - A[1][2]*A[2][0]);
        adj[1][1] =  (A[0][0]*A[2][2] - A[0][2]*A[2][0]);
        adj[1][2] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0]);

        adj[2][0] =  (A[1][0]*A[2][1] - A[1][1]*A[2][0]);
        adj[2][1] = -(A[0][0]*A[2][1] - A[0][1]*A[2][0]);
        adj[2][2] =  (A[0][0]*A[1][1] - A[0][1]*A[1][0]);

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[j][i]/det;
        return inv;
    }

    public static void main(String[] args) {
        // Example for 3x3 matrices
        double[][] A = createRandomMatrix(3,3);
        double[][] B = createRandomMatrix(3,3);

        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A,B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A,B));

        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(A,B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A (3x3): " + determinant3x3(A));

        double[][] invA = inverse3x3(A);
        if(invA != null){
            System.out.println("\nInverse of A:");
            displayMatrix(invA);
        } else {
            System.out.println("\nMatrix A is singular, inverse does not exist.");
        }

        double[][] C = createRandomMatrix(2,2);
        System.out.println("\nMatrix C (2x2):");
        displayMatrix(C);
        System.out.println("Determinant of C: " + determinant2x2(C));
        double[][] invC = inverse2x2(C);
        if(invC != null){
            System.out.println("Inverse of C:");
            displayMatrix(invC);
        } else {
            System.out.println("Matrix C is singular, inverse does not exist.");
        }
    }
}
