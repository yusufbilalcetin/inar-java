package week_07.assignment;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers :");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            if (isArray(number, numbers, count)) {
                for (int j = count; j < numbers.length; j++) {
                    numbers[j] = number;
                    break;
                }
                count++;
            }
        }
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are : ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static boolean isArray(int number, int[] array, int count) {
        boolean isCorrect = true;
        for (int i = 0; i < count; i++) {
            if (array[i] == number) {
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }
}
