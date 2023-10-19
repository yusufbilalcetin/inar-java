package week_08.assignment;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        int[][] matrix = GetEmployeeOfNumber(8, 7);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Employee's " + i + "'s total work our hour is " + employeeWorkOfHour(h, i));
        }
    }

    private static int[][] GetEmployeeOfNumber(int i, int j) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        int[][] matrix = new int[i][j];

        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[k].length; l++) {
                matrix[k][l] = input.nextInt();
            }
        }


    private static int[][] employeeWorkOfHour(int h, int i) {

    }
}

