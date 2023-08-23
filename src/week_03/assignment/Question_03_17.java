package week_03.assignment;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("scissor (0), rock(1), paper(2): ");
        int playerChoice = input.nextInt();

        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("invalid choice ");
        }

        int computerChoice = (int) (Math.random() * 2);


        if (computerChoice == 0 && playerChoice == 0) {
            System.out.println("the computer is scissor. You are scissor too. it is a draw");
        } else if (computerChoice == 0 && playerChoice == 1) {
            System.out.println("the computer is scissor. You are rock. You are won");
        } else if (computerChoice == 0 && playerChoice == 2) {
            System.out.println(("the computer is scissor. You are paper. You are lost"));
        } else if (computerChoice == 1 && playerChoice == 0) {
            System.out.println("the computer is rock. You are scissor. You are lost");
        } else if (computerChoice == 1 && playerChoice == 1) {
            System.out.println(("the computer is rock. You are rock too. it is a draw"));
        } else if (computerChoice == 1 && playerChoice == 2) {
            System.out.println("the computer is rock. You are paper. You are won");
        } else if (computerChoice == 2 && playerChoice == 0) {
            System.out.println("the computer is paper. You are scissor You are won");
        } else if (computerChoice == 2 && playerChoice == 1) {
            System.out.println(("the computer is paper. You are rock . You are lost"));
        } else if (computerChoice == 2 && playerChoice == 2) {
            System.out.println("the computer is paper. You are paper too. it is a draw");
        }

    }
}
