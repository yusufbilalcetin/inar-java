package week_07.assignment;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] value = new double[10];
        System.out.print("Enter ten values of double type :");
        for (int i = 0; i < value.length; i++) {
            value[i] = input.nextDouble();
        }
        System.out.println("The average value :" + average(value));
    }

    private static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

}
