package week_08.assignment;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        double[][] matrix = getArray(4, 4);

            System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }

    private static double[][] getArray(int i, int j) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[i][j];

        for (int y = 0; y < matrix.length; y++) {
            for (int k = 0; k < matrix[y].length; k++) {
                matrix[y][k] = input.nextDouble();
            }
        }
        return matrix;
    }

    private static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        for (int i = 0, l = m.length - 1; i < m.length; i++, l--) {
            sum2 += m[i][l];
        }
        return Math.max(sum, sum2);
    }
}
