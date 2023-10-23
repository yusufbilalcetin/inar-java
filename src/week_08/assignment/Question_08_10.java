package week_08.assignment;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        fill2DarrayWithRandomValues(matrix);
        findTheMaxOfRow(matrix);
        findTheMaxOfColumn(matrix);
    }

    public static void fill2DarrayWithRandomValues(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findTheMaxOfRow(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println("The largest row index = " + maxSumIndex);
    }

    public static void findTheMaxOfColumn(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = -1;

        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println("The largest column index = " + maxSumIndex);
    }
}