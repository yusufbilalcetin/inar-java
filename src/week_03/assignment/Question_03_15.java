package week_03.assignment;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int lotteryDigit1 = (int) (Math.random() * 10);
        int lotteryDigit2 = (int) (Math.random() * 10);
        int lotteryDigit3 = (int) (Math.random() * 10);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2 + lotteryDigit3);


        // lottery digit 123
        // guess digit 322

        if (((lotteryDigit1 * 100) + (lotteryDigit2 * 10) + lotteryDigit3) == guess) {
            System.out.println("Wohooo ! Exact match, you won $10,000");
        } else if ((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3) &&
                (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3) &&
                (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)) {
            System.out.println("Match all digits, you won $3,000");
        }
        else if ((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3) ||
                (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3) ||
                (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)) {
            System.out.println("Match one digit, you won $1,000");

        }
        else {
            System.out.println("Sorry no match");
        }
    }
}
