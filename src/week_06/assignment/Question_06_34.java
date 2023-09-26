package week_06.assignment;

import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();
        printTheMonth(year,month);
    }

    public static void printTheMonth(int year, int month) {
        printHeader(year, month);
        printDays(year, month);
    }
}
