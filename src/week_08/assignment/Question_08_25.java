package week_08.assignment;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        /*
        0.15 0.875 0.375
        0.55 0.005 0.225
        0.30 0.12 0.4
        (It is "A" markov matrix)
        -------------------
        0.95 -0.875 0.375
        0.65 0.005 0.225
        0.30 0.22 -0.4
         (It is "NOT" markov matrix)
         */

        double[][] matrix = getMatrixFromUser();

        System.out.println("It is" + (isMarkovMatrix(matrix) ? " a " : " not ") +
                "Markov matrix");
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

    public static boolean isMarkovMatrix(double[][] matrix) {
        double sumColumn;
        for (int i = 0; i < matrix[0].length; i++) {
            sumColumn = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
                sumColumn += matrix[j][i];
            }
            if (sumColumn != 1.0) {
                return false;
            }
        }
        return true;
    }
}
