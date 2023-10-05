package week_07.assignment;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        System.out.println("The greatest common divisor is " + gcd(number));
    }

    public static int gcd(int... number) {
        int minNumber = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < minNumber) {
                minNumber = number[i];
            }
        }
        int divisior = 1;
        int gcd = 0;
        boolean isGcd = false;
        while (divisior <= minNumber) {
            for (int i = 0; i < number.length; i++) {
                if (number[i] % divisior == 0) {
                    isGcd = true;
                } else {
                    isGcd = false;
                    break;
                }
            }
            if (isGcd) {
                gcd = divisior;
            }
            divisior++;
        }
        return gcd / 2;
    }
}
