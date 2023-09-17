package week_05.assignment;


import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the amount :");
        int line = input.nextInt();

        for (int i = 0; i <= 7; i++) {
            System.out.printf("%" + line + "s", "");
            line -= 4;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", (int) Math.pow(2, k));
            }
            for (int l = i; 1 <= l; l--) {
                System.out.printf("%4d", (int) Math.pow(2, l - 1));
            }
            System.out.println();
        }
    }
}
