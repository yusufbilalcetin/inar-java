package week_05.assignment;

import java.util.Scanner;

public class Question_05_18 {
    public static void main(String[] args) {
        int number = 6;

        for (int i = number; i > 0; i--) {
            for (int j = 1; j <= number + 1 - i; j++) {
                System.out.print(j + "   ");

            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number + 1 - i; j++) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print("    ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "   ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("    ");
            }
            for (int k = 1; k <=number-i+1 ; k++) {
                System.out.print(k + "   ");
            }
            System.out.println();
            
        }
    }
}
