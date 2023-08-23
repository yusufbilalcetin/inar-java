package week_03.assignment;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\uD83C\uDFAE\uD83D\uDD79️ Let's play Rock paper scissors! \uD83C\uDFAE\uD83D\uDD79️ \n\t➡️ For scissors press [0]\n\t➡️ For stone press    [1]\n\t➡️ For paper press    [2]\n Please make your choice : ");
        int playerChoice = input.nextInt();

        // Check if the player sent valid input
        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("invalid choice \uD83E\uDD2A Plase choose [0],[1] or [2]");
            System.exit(0);
        }
        int computerChoice = (int) (Math.random() * 2);

        // first option: same choices
        if (computerChoice == playerChoice) {
            System.out.println("It's draw!");
            switch (playerChoice) {
                case 0:
                    System.out.println("You and the computer have chosen the scissors!");
                case 1:
                    System.out.println("You and the computer have chosen the rocks!");
                case 2:
                    System.out.println("You and the computer have chosen the papers!");
            }
            // second option: different choices
        } else {
            switch (playerChoice) {
                // At this point, there are only two possibilities: either I've won, or I've lost.
                case 0:
                    System.out.println((computerChoice != 1) ? "You chose scissor and the computer chose rock. You lost! ☹️" : "You chose scissor and the computer chose paper. You won! \uD83E\uDD73");
                    break;
                case 1:
                    System.out.println((computerChoice != 2) ? "You chose rock and the computer chose paper. You lost! ☹️" : "You chose rock and the computer chose scissor. You won! \uD83E\uDD73");
                    break;
                case 2:
                    System.out.println((computerChoice != 0) ? "You chose paper and the computer chose scissor. You lost! ☹️" : "You chose paper and the computer chose rock. You won! \uD83E\uDD73");
                    break;
            }

        }
    }
}
