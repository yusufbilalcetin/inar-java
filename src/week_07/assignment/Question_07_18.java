package week_07.assignment;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        bubbleSort(array);
        for (double e : array) {
            System.out.println(e + " ");
        }
    }

    public static void bubbleSort(double[] array) {
        for (int i = 0 ; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i] = temp;
            }
        }
    }
}
