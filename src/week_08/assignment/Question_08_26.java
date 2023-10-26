package week_08.assignment;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        /*
        0.15 0.875 0.375
        0.55 0.005 0.225
        0.30 0.12 0.4
         */
        double[][] matrix = getMatrixFromUser();
        displayMatrix(matrix);

        double[][] matrixSorted = CopyMatrix(matrix);
        sortRows(matrixSorted);

        System.out.println("The row-sorted array is ");
        displayMatrix(matrixSorted);
    }

    public static double[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    private static double[][] CopyMatrix(double[][] matrix) {
        double[][] sortedMatrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sortedMatrix[i][j] = matrix[i][j];
            }
        }
        return sortedMatrix;
    }

    private static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                double min = m[row][column];
                int minIndex = column;
                for (int i = column + 1; i < m.length; i++) {
                    if (m[row][i] < min) {
                        min = m[row][i];
                        minIndex = i;
                    }
                }
                if (minIndex != column) {
                    m[row][minIndex] = m[row][column];
                    m[row][column] = min;
                }
            }
        }
        return m;
    }
}
