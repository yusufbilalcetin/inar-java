package week_02.assignment;

import java.util.Scanner;

public class Question_02_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate(e.g.,3 for 3%): ");

        int balance = input.nextInt();
        double annuallInterestRate = input.nextDouble();

        double interest = balance * (annuallInterestRate / 1200);

        System.out.println("The interest is " + (int)(interest * 10000) / 10000.0);
    }
}
