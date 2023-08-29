package week_04.assignment;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade : ");
        String letter = input.nextLine();

        char ch = letter.charAt(0);
        if ((ch <= 'F' && ch >= 'A')) {
            if (letter.equals("A")) {
                System.out.println("the numeric value for grade A is 4");
            } else if (letter.equals("B")) {
                System.out.println("the numeric value for grade B is 3");
            } else if (letter.equals("C")) {
                System.out.println("the numeric value for grade C is 2");
            } else if (letter.equals("D")) {
                System.out.println("the numeric value for grade D is 1");
            } else if (letter.equals("F")) {
                System.out.println("the numeric value for grade F is 0");
            }
        } else {
            System.out.println(letter + " is an invalid grade");
        }
    }
}
