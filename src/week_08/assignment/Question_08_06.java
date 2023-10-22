package week_08.assignment;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        double[][] matrixOne = getMatrix();

        System.out.print("Enter matrix2: ");
        double[][] matrixTwo = getMatrix();

        double[][] multiplyMatrix = multiplyMatrix(matrixOne, matrixTwo);
        printMatrix(matrixOne, matrixTwo, multiplyMatrix);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] multiplyMatrix = new double[3][3];

        for (int row = 0; row < multiplyMatrix.length; row++) {
            for (int column = 0; column < multiplyMatrix[row].length; column++) {
                multiplyMatrix[row][column] = (matrix1[row][0] * matrix2[0][column]) + (matrix1[row][1] * matrix2[1][column]) + (matrix1[row][2] * matrix2[2][column]);
            }
        }

        return multiplyMatrix;
    }

    private static void printMatrix(double[][] matrixOne, double[][] matrixTwo, double[][] addedMatrix) {
        System.out.println("the multiplication of the matrices is");
        for (int row = 0; row < matrixOne.length; row++) {
            for (int column = 0; column < matrixOne[row].length; column++) {

                System.out.printf("%.0f%s", matrixOne[row][column], " ");
            }
            if (row != 1) {
                System.out.print("         ");
            } else {
                System.out.print("    *    ");
            }
            for (int column = 0; column < matrixTwo[row].length; column++) {
                System.out.printf("%.1f%s", matrixTwo[row][column], " ");
            }
            if (row != 1) {
                System.out.print("         ");
            } else {
                System.out.print("    =    ");
            }
            for (int column = 0; column < addedMatrix[row].length; column++) {
                System.out.printf("%.1f%s", addedMatrix[row][column], " ");
            }
            System.out.println();
        }


    }
}
