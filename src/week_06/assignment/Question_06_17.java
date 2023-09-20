package week_06.assignment;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int number = input.nextInt();
        printMatrix(number);
    }

    public static void printMatrix(int n) {
        for (int i = 1; i <= n * n; i++) {
            if (i % n == 0) {
                System.out.print((int) (Math.random() * 2));
                System.out.println();
            } else System.out.print((int) (Math.random() * 2) + "  ");
        }
    }
}
