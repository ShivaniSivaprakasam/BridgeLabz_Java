package coreprogramming.javamethods.level3;

import java.util.Random;

/*
 * Matrix class
 * ------------
 * This class provides methods to perform basic and advanced operations on matrices:
 * 1. Create random matrices of given dimensions.
 * 2. Display matrices in a readable format.
 * 3. Add, subtract, and multiply matrices.
 * 4. Transpose a matrix.
 * 5. Calculate determinants for 2x2 and 3x3 matrices.
 * 6. Find the inverse of 2x2 and 3x3 matrices (if non-singular).
 * 
 * The main method demonstrates all these operations using example 2x2 and 3x3 matrices.
 */
public class Matrix {

    // Create a random matrix with values between 1 and 10
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // Random integer from 1 to 10
        return matrix;
    }

    // Display the matrix in formatted rows and columns
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val); // Print each value with 2 decimal places
            }
            System.out.println(); // New line after each row
        }
    }

    // Add two matrices of the same dimensions
    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Subtract matrix B from matrix A
    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Multiply two matrices (A * B)
    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = B[0].length, n = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += A[i][k] * B[k][j]; // Matrix multiplication formula
        return result;
    }

    // Transpose a matrix (rows become columns)
    public static double[][] transposeMatrix(double[][] A) {
        int rows = A.length, cols = A[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = A[i][j];
        return transposed;
    }

    // Determinant of a 2x2 matrix: |A| = ad - bc
    public static double determinant2x2(double[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    // Determinant of a 3x3 matrix using rule of Sarrus
    public static double determinant3x3(double[][] A) {
        return A[0][0] * (A[1][1]*A[2][2] - A[1][2]*A[2][1])
             - A[0][1] * (A[1][0]*A[2][2] - A[1][2]*A[2][0])
             + A[0][2] * (A[1][0]*A[2][1] - A[1][1]*A[2][0]);
    }

    // Inverse of a 2x2 matrix: A^-1 = (1/det) * [[d, -b], [-c, a]]
    public static double[][] inverse2x2(double[][] A) {
        double det = determinant2x2(A);
        if (det == 0) return null; // Singular matrix has no inverse
        double[][] inv = {
                { A[1][1]/det, -A[0][1]/det },
                { -A[1][0]/det, A[0][0]/det }
        };
        return inv;
    }

    // Inverse of a 3x3 matrix using adjoint method: A^-1 = adj(A)/det(A)
    public static double[][] inverse3x3(double[][] A) {
        double det = determinant3x3(A);
        if (det == 0) return null; // Singular matrix has no inverse

        double[][] adj = new double[3][3];

        // Compute cofactors for adjoint matrix
        adj[0][0] =  (A[1][1]*A[2][2] - A[1][2]*A[2][1]);
        adj[0][1] = -(A[0][1]*A[2][2] - A[0][2]*A[2][1]);
        adj[0][2] =  (A[0][1]*A[1][2] - A[0][2]*A[1][1]);

        adj[1][0] = -(A[1][0]*A[2][2] - A[1][2]*A[2][0]);
        adj[1][1] =  (A[0][0]*A[2][2] - A[0][2]*A[2][0]);
        adj[1][2] = -(A[0][0]*A[1][2] - A[0][2]*A[1][0]);

        adj[2][0] =  (A[1][0]*A[2][1] - A[1][1]*A[2][0]);
        adj[2][1] = -(A[0][0]*A[2][1] - A[0][1]*A[2][0]);
        adj[2][2] =  (A[0][0]*A[1][1] - A[0][1]*A[1][0]);

        // Divide adjoint by determinant to get inverse
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[j][i] / det; // Transpose adjoint while dividing by det

        return inv;
    }

    // Main method to demonstrate all matrix operations
    public static void main(String[] args) {
        // Example 3x3 matrices
        double[][] A = createRandomMatrix(3, 3);
        double[][] B = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A (3x3): " + determinant3x3(A));

        // Inverse of A (3x3)
        double[][] invA = inverse3x3(A);
        if (invA != null) {
            System.out.println("\nInverse of A:");
            displayMatrix(invA);
        } else {
            System.out.println("\nMatrix A is singular, inverse does not exist.");
        }

        // Example 2x2 matrix
        double[][] C = createRandomMatrix(2, 2);
        System.out.println("\nMatrix C (2x2):");
        displayMatrix(C);

        System.out.println("Determinant of C: " + determinant2x2(C));

        // Inverse of C (2x2)
        double[][] invC = inverse2x2(C);
        if (invC != null) {
            System.out.println("Inverse of C:");
            displayMatrix(invC);
        } else {
            System.out.println("Matrix C is singular, inverse does not exist.");
        }
    }
}
