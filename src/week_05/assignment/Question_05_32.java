package week_05.assignment;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your lottery pick (two distinct digits ) : ");
        int guess = input.nextInt();

        int lotteryDigit1 = (int) (Math.random() * 10);
        int lotteryDigit2 = 0;
        boolean value = true;

        while (value) {
            lotteryDigit2 = (int) (Math.random() * 10);
            if (lotteryDigit1 != lotteryDigit2) {
                value = false;
            }
        }

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("the lottery number is " + lotteryDigit1 + lotteryDigit2);

        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("Your guess is correct, you won $10,000 ");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit1) {
            System.out.println("Match all digit : you won $3,000 ");
        } else if (guessDigit1 == lotteryDigit1 && guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("match one digit: you won $1,000");
        } else {
            System.out.println("Sorry, no match ");
        }
    }
}
