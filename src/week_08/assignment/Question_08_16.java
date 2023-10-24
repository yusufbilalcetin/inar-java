package week_08.assignment;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] matrix = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(matrix);
        displayArray(matrix);
    }

    public static void sort(int m[][]) {
        int[] temp;
        for (int row = 0; row < m.length - 1; row++) {
            int currentMinX = m[row][0];
            int currentMinY = m[row][1];
            int currentMinIndex = row;

            for (int j = row + 1; j < m.length; j++) {
                if (m[j][0] < currentMinX || (m[j][0] == currentMinX && m[j][1] < currentMinY)) {
                    currentMinX = m[j][0];
                    currentMinY = m[j][1];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != row) {
                temp = m[row];
                m[row] = m[currentMinIndex];
                m[currentMinIndex] = temp;
            }
        }
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
