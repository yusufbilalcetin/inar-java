package week_08.assignment;

import java.util.Scanner;
public class Question_08_01 {
    public static void main(String[] args) {
        double[][] matrix = getArray(3, 4);

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }
    }

    private static double sumColumn(double[][] m, int columnIndex) {
        double sumOfColumn = 0;
        for (int j = 0; j < m.length; j++) {
            sumOfColumn += m[j][columnIndex];
        }
        return sumOfColumn;
    }

    private static double[][] getArray(int m, int columnIndex) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[m][columnIndex];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
