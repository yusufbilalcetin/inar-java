package week_07.assignment;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] randomNumber = new int[10];
        System.out.print("Enter ten numbers to exclude from random (1-54): ");
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = input.nextInt();
        }
        System.out.print("Number generated: " + getRandom(randomNumber));
    }

    public static int getRandom(int... numbers) {
        boolean isSame = true;
        int number = 0;
        while (isSame) {
            number = (int) (Math.random() * 53 + 1);
            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i]) {
                    isSame = true;
                    break;
                } else {
                    isSame = false;
                }
            }
        }
        return number;
    }
}
