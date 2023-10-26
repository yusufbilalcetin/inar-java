package week_08.assignment;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        double[][] matrix = getMatrixFromUser();

        System.out.println("The row-sorted array is \n" + sortRows(matrix));
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

    public static double[][] sortRows(double[][] m) {


    }
}
