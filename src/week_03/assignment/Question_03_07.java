package week_03.assignment;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the amount (e.g 11,56): ");
        double amount = input.nextDouble();

        if (amount < 0) {
            System.out.println("invalid money");
        } else if (amount == 0) {
            System.out.println("0 $");
        } else {
            int remaningAmount = (int)(amount * 100);

            int numberOfDollars = remaningAmount / 100;
            remaningAmount = remaningAmount % 100;

            int numberOfQuarters = remaningAmount / 25;
            remaningAmount = remaningAmount % 25;

            int numberOfDimes = remaningAmount / 10;
            remaningAmount = remaningAmount % 10;

            int numberOfNickels = remaningAmount / 5;
            remaningAmount = remaningAmount % 5;

            int numberOfPennies = remaningAmount;
            System.out.println("your amount " + amount + " consists of ");
            System.out.println( numberOfDollars + " Dollars ");
            System.out.println( numberOfQuarters + " Quarters ");
            System.out.println( numberOfDimes + " Dimes ");
            System.out.println( numberOfNickels + " Nickels ");
            System.out.println( numberOfPennies + " pennies ");
        }
    }
}
