package week_08.assignment;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] array = ArrayWithRandomValues(size);
        displayArray(array);

        displayRowControl(array);
        displayColumnControl(array);
        displayMajorDiagonalControl(array);
        displaySubDiagonalControl(array);

    }

    public static int[][] ArrayWithRandomValues(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void displayRowControl(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            boolean isSameRow = true;
            int number = m[i][0];
            for (int j = 0; j < m[i].length; j++) {
                if (number != m[i][j]) {
                    isSameRow = false;
                }
            }
            if (isSameRow) {
                System.out.println("all " + number + "s on row " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void displayColumnControl(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            boolean isSameColumn = true;
            int number = m[0][i];
            for (int j = 0; j < m.length; j++) {
                if (number != m[j][i]) {
                    isSameColumn = false;
                }
            }
            if (isSameColumn) {
                System.out.println("All " + number + "s on column " + i);
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void displayMajorDiagonalControl(int[][] m) {
        int count = 0;
        int number = m[0][0];
        boolean isSameMajorDiagonal = true;
        for (int i = 1; i < m.length; i++) {
            if (number != m[0][0]) {
                isSameMajorDiagonal = false;
            }
            if (isSameMajorDiagonal) {
                System.out.println("All " + number + "s major diagonal");
            } else {
                System.out.println("No same numbers on a major diagonal");
            }
        }
    }

    public static void displaySubDiagonalControl(int m[][]) {
        int count = 0;
        int number = m[0][m.length - 1];
        boolean isSameSubDiagonal = true;
        for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
            if (number != m[i][j]) {
                isSameSubDiagonal = false;
            }
        }
        if (isSameSubDiagonal) {
            System.out.println("All " + number + "s numbers on the sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
}

