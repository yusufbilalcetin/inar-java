package week_05.assignment;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount : ");
        double amount = input.nextDouble();

        System.out.print("Enter annual percentage yield : ");
        double annualPercentageYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months) : ");
        double months = input.nextDouble();

        for (int i = 0; i < months; i++) {
            amount += amount * (annualPercentageYield / 1200);
            System.out.printf("%-8d%.2f" , (i + 1) , amount);
            System.out.println();

        }
    }
}
