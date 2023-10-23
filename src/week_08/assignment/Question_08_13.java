package week_08.assignment;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        /*
        3 4
        -------------
        23.5 35 2 10
        4.5 3 45 3.5
        35 44 5.5 9.6
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        System.out.println("Enter the array: ");
        double[][] array = getArray(input, row, column);

        int[] list = localLargest(array);

        System.out.println("The location of the largest element is at " + "(" + list[0] + ", " + list[1] + ")");

    }

    public static double[][] getArray(Scanner input, int row, int column) {
        double[][] array = new double[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }

    public static int[] localLargest(double[][] array) {
        int[] list = new int[2];
        double largest = Double.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > largest) {
                    largest = array[i][j];
                    list[0] = i;
                    list[1] = j;
                }
            }
        }
        return list;
    }
}
