package week_06.assignment;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int number = input.nextInt();

        displayPattern(number);
    }

    public static void displayPattern(int n) {
        int sum = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sum; j++) {
                System.out.print("  ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            sum--;
        }
    }
}
