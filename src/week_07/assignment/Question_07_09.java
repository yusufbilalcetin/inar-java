package week_07.assignment;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        System.out.println("The minimum number is : " + min(number));

    }

    private static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
