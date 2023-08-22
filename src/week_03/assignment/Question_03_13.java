package week_03.assignment;

import java.util.Scanner;

public class Question_03_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filter, 1-married jointly or " +
                "qualifying widow(er), + 2- married separately, 3-head of household) " +
                "\n Enter the filing status: ");
        int status = input.nextInt();

        System.out.print("Enter your income: ");
        double income = input.nextDouble();

        double tax = 0;


        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
        } else if (income < 33950) {
            tax = 8350 * 0.10 + (income - 8350) * 0.15;
        } else if (income <= 82250) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
        } else if (income < 171550) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
        } else if (income <= 372950) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
        } else if (income > 171550) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }

        if (status == 1) {
            if (income <= 16.700)
                tax = income * 0.10;
        } else if (income <= 67.900) {
            tax = 16700 * 0.10 + (income - 16700) * 15;
        } else if (income <= 137.050) {
            tax = 137050 * 0.10 + (137050 - 67900) * 15 + (income - 137.050) * 25;
        } else if (income < 208.850) {
            tax = 137050 * 0.10 + (137050 - 67900) * 15 + (137050 - 67900) * 25 + (income - 137050) * 28;
        } else if (income < 372.950) {
            tax = 137050 * 0.10 + (137050 - 67900) * 15 + (137050 - 67900) * 25 + (208.850 - 137050) * 28 + (income - 208850) * 33;
        } else if (income <= 372.950) {
            tax = 137050 * 0.10 + (137050 - 67900) * 15 + (137050 - 67900) * 25 + (208850 - 137050) * 28 + (372950 - 208850) * 33 + (income - 372.950) * 0.35;
        }

        if (status == 2) {
            if (income < 8350)
                tax = income * 0.10;
        } else if (income <= 33950) {
            tax = 8350 * 0.10 + (income - 33950) * 15;
        } else if (income <= 68525) {
            tax = 68525 * 0.10 + (68525 - 33950) * 15 + (income - 68525) * 25;
        } else if (income <= 208.850) {
            tax = 68525 * 0.10 + (68525 - 33950) * 15 + (68950 - 33950) * 25 + (income - 68525) * 28;
        } else if (income <= 372.950) {
            tax = 68525 * 0.10 + (68525 - 33950) * 15 + (68525 - 33950) * 25 + (208.850 - 68525) * 28 + (income - 208850) * 33;
        } else if (income <= 372.950) {
            tax = 68525 * 0.10 + (68950 - 33950) * 15 + (137050 - 67900) * 25 + (208850 - 68525) * 28 + (372950 - 208850) * 33 + (income - 372.950) * 0.35;
        }

        if (status == 3) {
            if (income <= 11.950)
                tax = income * 0.10;
        } else if (income <= 45.500) {
            tax = 11950 * 0.10 + (income - 45500) * 15;
        } else if (income <= 117.450) {
            tax = 117450 * 0.10 + (117450 - 45500) * 15 + (income - 117450) * 25;
        } else if (income <= 190.200) {
            tax = 117450 * 0.10 + (117450 - 33950) * 15 + (117450 - 45500) * 25 + (income - 117450) * 28;
        } else if (income <= 372.950) {
            tax = 117450 * 0.10 + (117450 - 33950) * 15 + (117450 - 45500) * 25 + (190200 - 117450) * 28 + (income - 208850) * 33;
        } else if (income <= 117450) {
            tax = 117450 * 0.10 + (117450 - 33950) * 15 + (137050 - 45500) * 25 + (208850 - 117450) * 28 + (372950 - 190200) * 33 + (income - 372.950) * 0.35;
        } else {
            System.out.println("error: invalid status: ");
            System.exit(1);
        }
        System.out.println("tax is " + (int) (tax * 100) / 100.0);
    }
}
            }
                    }
                    }