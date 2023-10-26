package week_08.assignment;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        /*
        ---------------list1------------------
        51 22 25 6 1 4  24 54 6
        ---------------list2------------------
        51 22 25 6 1 4 24 54 6
        -------------------------------------
        **************list1******************
        51 25 22 6 1 4 24 54 6
        **************list2*****************
        51 22 25 6 1 4 24 54 6

         */
        System.out.println("Enter list1: ");
        int[][] matrix1 = getListFromUser();

        System.out.println("Enter list2: ");
        int[][] matrix2 = getListFromUser();

        System.out.println("The two arrays are " + (equals(matrix1, matrix2) ? "" : " not ") + "strictly identical");
    }

    public static int[][] getListFromUser() {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
