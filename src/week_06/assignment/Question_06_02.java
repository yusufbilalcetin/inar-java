package week_06.assignment;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int num1 = input.nextInt();
        System.out.print("the sum of the digits in " + num1 + " is " + sumDigits(num1));
    }

    public static long sumDigits(long num1) {
        long sum = 0;
        while (num1 > 0) {
            sum += num1 % 10;
            num1 /= 10;
        }
        return sum;
    }


}

