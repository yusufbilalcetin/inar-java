package week_08.assignment;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {
        /*
        3 2 7 8 9 5 4 1 6
        1 4 8 6 3 7 9 5 2
        6 5 9 2 4 1 8 3 7
        7 1 5 9 6 4 2 8 3
        2 6 4 1 8 3 7 9 5
        9 8 3 7 5 2 6 4 1
        5 3 6 4 2 8 1 7 9
        8 7 2 5 1 9 3 6 4
        4 9 1 3 7 6 5 2 8
------------------------------------
        9 6 3 1 7 4 2 5 8
        1 7 8 3 2 5 6 4 9
        2 5 4 6 8 9 7 3 1
        8 2 1 4 3 7 5 9 6
        4 9 6 8 5 2 3 1 7
        7 3 5 9 6 1 8 2 4
        5 8 9 7 1 3 4 6 2
        3 1 7 2 4 6 9 8 5
        6 4 2 5 9 8 1 7 3
         */
        int[][] grid = readAsolution();
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    public static int[][] readAsolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sudoku puzzle solution: ");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9 || isValid(i, j, grid)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int i, int j, int[][] grid) {
        for (int column = 0; column < 9; column++) {
            if (column != j && grid[i][column] == grid[i][j]) {
                return false;
            }
        }
        for (int row = 0; row < 9; row++) {
            if (row != i && grid[row][j] == grid[i][j]) {
                return false;
            }
        }
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int column = (j / 3) * 3; column < (j / 3) * 3 + 3; column++) {
                if (row != i && column != j && grid[row][column] == grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
