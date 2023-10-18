package week_08.live_class;

public class Deneme {
    public static void main(String[] args) {
        //Write a Java program to search for a specific element in a 2D array and print its position (row and column).
        /*
         int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            Element 6 found at position (1, 2)
         */
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 6;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (target == matrix[i][j]) {
                    System.out.println("Element " + target + " found at position " + "( " + i + "," + j + " )");
                }
            }
        }
    }
}
