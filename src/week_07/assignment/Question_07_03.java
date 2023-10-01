package week_07.assignment;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] occurs = new int[100];
        System.out.print("Enter the integer between 1 and 100 :");
        boolean isZero = true;

        while (isZero) {
            int number = input.nextInt();
            if (number == 0) {
                isZero = false;
            } else {
                occurs[number - 1]++;
            }
        }
        for (int i = 0; i < occurs.length; i++) {
            if (occurs[i] > 0) {
                System.out.print((i + 1) + " occurs " + occurs[i]);
                if (occurs[i] == 1) {
                    System.out.println(" time");
                } else {
                    System.out.println(" times");
                }
            }
        }
    }
}
