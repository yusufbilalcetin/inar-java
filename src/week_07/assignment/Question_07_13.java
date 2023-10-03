package week_07.assignment;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] randomNumber = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter ten numbers to excude from random (1-54): ");
            randomNumber[i] = input.nextInt();
        }
    }
}
