package week_07.assignment;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[101];
        System.out.println("Enter scores : ");
        int value;
        do {
            value = input.nextInt();
            if (value >= 0) {
                numbers[value]++;
            }

        } while (value >= 0);
        int average = average(numbers);
        System.out.println("Average of scores : " + average);
        numberOfScoresAboveOrBelowAverage(numbers, average);
    }

    public static void numberOfScoresAboveOrBelowAverage(int[] numbers, int average) {
        int belowAverage = 0;
        int equalOrAboveAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i >= average) {
                equalOrAboveAverage += numbers[i];//number[1] = 1
            } else {
                belowAverage += numbers[i];
            }
        }
        System.out.println("Number of scores above or equal to average : " + equalOrAboveAverage);
        System.out.println("Number of scores below average : " + belowAverage);
    }

    public static int average(int[] numbers) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * i;
            if (numbers[i] > 0) {
                count += numbers[i];
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
}
