package week_10.live_class;

import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of the years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95:");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n"
                        + "The monthy payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());

    }
}
