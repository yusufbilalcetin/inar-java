package week_06.assignment;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.print(getNumber(Character.toUpperCase(str.charAt(i))));
            } else {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }

    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= 'W') {
            return 9;
        } else if (uppercaseLetter >= 'T') {
            return 8;
        } else if (uppercaseLetter >= 'P') {
            return 7;
        } else if (uppercaseLetter >= 'M') {
            return 6;
        } else if (uppercaseLetter >= 'J') {
            return 5;
        } else if (uppercaseLetter >= 'G') {
            return 4;
        } else if (uppercaseLetter >= 'D') {
            return 3;
        } else {
            return 2;
        }
    }


}

