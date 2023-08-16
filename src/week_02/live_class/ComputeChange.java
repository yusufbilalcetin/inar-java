package week_02.live_class;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of money :");

        double amount = input.nextDouble();

        int remaningAmount = (int) (amount * 100);

        int dollars = remaningAmount / 100;

        int quarters = (remaningAmount %= 100) / 25;

        int dimes = (remaningAmount %= 25) / 10;

        int nickels  = (remaningAmount %= 10) / 5;

        int pennies  = (remaningAmount %= 5);

        System.out.println("Your amount " + amount + " consits of: ");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
