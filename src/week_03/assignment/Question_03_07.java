package week_03.assignment;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the amount (e.g 11,56): ");
        double amount = input.nextDouble();

        int remaningAmount = (int) (amount * 100);

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

        if (numberOfDollars > 1) {
            System.out.println(numberOfDollars + " Dollars");
        } else {
            System.out.println(numberOfDollars + " Dollar");
        }
        if (numberOfQuarters > 1) {
            System.out.println(numberOfQuarters + " Quarters");
        } else {
            System.out.println(numberOfQuarters + " Quarter");
        }
        if (numberOfDimes > 1) {
            System.out.println(numberOfDimes + " Dimes");
        } else {
            System.out.println(numberOfDimes + " Dime");
        }
        if (numberOfNickels > 1) {
            System.out.println(numberOfNickels + " Nickels");
        } else {
            System.out.println(numberOfNickels + " Nickel");
        }
        if (numberOfPennies > 1) {
            System.out.println(numberOfPennies + " Pennies");
        } else {
            System.out.println(numberOfPennies + " Pennie");
        }
    }
}
