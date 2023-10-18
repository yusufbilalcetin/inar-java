package week_07.assignment;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students :");
        int numberOfStudent = input.nextInt();

        int[] score = new int[numberOfStudent];
        System.out.print("Enter 4 scores: ");
        int bestScore = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            if (score[i] > bestScore) {
                bestScore = score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            System.out.print("student " + i + " score is " + (int) score[i] + " and grade is ");
            if (score[i] >= bestScore - 10) {
                System.out.print("A");
                System.out.println();
            } else if (score[i] >= bestScore - 20) {
                System.out.print("B");
                System.out.println();
            } else if (score[i] >= bestScore - 30) {
                System.out.print("C");
                System.out.println();
            } else if (score[i] >= bestScore - 40) {
                System.out.print("D");
                System.out.println();
            } else {
                System.out.print("F");
                System.out.println();
            }
        }
    }
}
