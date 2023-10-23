package week_08.assignment;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        System.out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er), " +
                "2-married separately, 3-head of " + "household) \nEnter the filing status: ");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        System.out.printf("Tax is %6.2f\n", computeTax(brackets, rates, status, income));
    }

    private static double computeTax(int[][] brackets, double[] rates, int status, double income) {
        double tax = 0;
        double incomeTax = 0;
        for (int i = 4; i >= 0; i--) {
            if (income > brackets[status][i]) {
                tax += (incomeTax = income - brackets[status][i]) * rates[i + 1];
            }
            income -= incomeTax;
        }
        return tax += brackets[status][0] * rates[0];
    }
}
