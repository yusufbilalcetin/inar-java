package week_08.assignment;


public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix();

        displayMatrix(matrix);

        System.out.println("Every row have " + (checkRowMatrix(matrix) ? " an " : "not") +
                " even number of 1s.");
        System.out.println("Every column have " + (checkColumnMatrix(matrix) ? " an " : "not") +
                " even number of 1s.");


    }

    public static int[][] generateMatrix() {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
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

    public static boolean checkRowMatrix(int[][] matrix) {
        return checkRow(matrix);
    }

    public static boolean checkColumnMatrix(int[][] matrix) {
        return checkColumn(matrix);
    }

    public static boolean checkRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumn(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
