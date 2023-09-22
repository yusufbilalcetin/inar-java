package week_06.assignment;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        System.out.println("the approximated square root of " + number + " is " + sqrt(number));
    }

    public static double sqrt(long number) {
        long lastGuess = 1;
        long nextGuess = (lastGuess + number / lastGuess) / 2;

        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + number / lastGuess) / 2;
        }
        lastGuess = nextGuess;
        return nextGuess = (lastGuess + number / lastGuess) / 2;
    }
}
