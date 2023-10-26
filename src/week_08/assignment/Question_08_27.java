package week_08.assignment;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        /*
        0.15 0.875 0.375 
        0.55 0.005 0.225 
        0.30 0.12 0.4
         */
        double[][] matrix = getMatrixFromUser();
        displayMatrix(matrix);

        double[][] matrixSorted = copyMatrix(matrix);
        sortedColumn(matrixSorted);

        System.out.println("The column-sorted array is ");
        displayMatrix(matrixSorted);
    }

    public static double[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] copyMatrix(double[][] matrix) {
        double[][] sortedColumn = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sortedColumn[i][j] = matrix[i][j];
            }
        }
        return sortedColumn;
    }

    public static void displayMatrix(double[][] matrix) {
        double[][] sortedMatrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortedColumn(double[][] m) {
        for (int column = 0; column < m[0].length; column++) {
            for (int row = 0; row < m.length - 1; row++) {
                double min = m[row][column];
                int minIndex = row;
                for (int i = row + 1; i < m.length; i++) {
                    if (m[i][column] < min) {
                        min = m[i][column];
                        minIndex = i;
                    }
                }
                if (minIndex != row) {
                    m[minIndex][column] = m[row][column];
                    m[row][column] = min;
                }
            }
        }
        return m;
    }
}
