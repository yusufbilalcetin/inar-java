package week_06.live_class;

import java.util.Scanner;

public class Example_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int row = input.nextInt();

        displayPattern(row);
    }

    public static void displayPattern(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
