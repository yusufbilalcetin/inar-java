package week_07.assignment;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        System.out.print("Enter ten integer :");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        for (int i = number.length - 1; i >=

                0; i--) {
            System.out.print(number[i] + " ");

        }
    }
}
