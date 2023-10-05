package week_07.assignment;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        System.out.println("The greatest common divisor is " + gcd(number));
    }

    public static int gcd(int... number) {
        int gcd = 1;
        boolean isDivisor;

        for (int i = 2; i < min(number); i++) {
            isDivisor = true;
            for (int e : number) {
                if (e % i != 0)
                    isDivisor = false;
            }
            if (isDivisor)
                gcd = i;
        }
        return gcd;
    }

    public static int min(int... numbers) {
        int min = numbers[0];
        for (int e : numbers) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }
}
