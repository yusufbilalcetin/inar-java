package week_08.assignment;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        /*
        1 1 1 0 1 1
        1 1 1 1 0 0
        0 1 0 1 1 1
        1 1 1 1 1 1
        0 1 1 1 1 0
        1 0 0 0 0 1
         */
        int[][] matrix = getMatrixFromuser();
        displayMatrix(matrix);
        int row = findTheRow(matrix);
        int column = findTheColumn(matrix);

        System.out.println("The flipped cell is at (" + row + ", " + column + ")");
    }

    private static int[][] getMatrixFromuser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix: ");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int findTheRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return i;
            }
        }
        return -1;

    }

    private static int findTheColumn(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return j;
            }
        }
        return -1;
    }
}
