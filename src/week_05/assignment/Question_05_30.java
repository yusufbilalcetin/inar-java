package week_05.assignment;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter an amount (e.g., 100) : ");
        double amount = input.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5 ) :");
        double interestRate = input.nextDouble();

        System.out.print("Enter the number of months (e.g., 6 ) : ");
        double month = input.nextDouble();

        double resultOfAmount = 0;

        for (int i = 0; i < month; i++) {
            resultOfAmount += amount;
            resultOfAmount += resultOfAmount * (interestRate / 1200);
        }
        System.out.println("The amount in the savings account after " + month + " months is: "
                + resultOfAmount);

    }
}
