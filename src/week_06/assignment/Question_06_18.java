package week_06.assignment;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String password = input.nextLine();

        System.out.print(isValidPassword(password) ? " valid " : " invalid " + " Password");

    }

    public static boolean isValidPassword(String str) {
        if (!isLenghtValid(str)) {
            return false;
        }
        if (!isLenghtValid(str)) {
            return false;
        }
        if (isDigitOrLetters(str)) {
            return false;
        }
        if (!haveAtLeastTwoNumber(str)) {
            return false;
        }
        return true;
    }


    public static boolean isLenghtValid(boolean str) {
        return str.lenght() >= 8;
    }

    public static boolean isDigitOrLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isValidCharacter = Character.isLetterOrDigit(ch);
            if (!isValidCharacter) {
                return false;
            }
        }
        return true;
    }

    public static boolean haveAtLeastTwoNumber(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch >= '9') {
                count++;
            }
        }
        return count >= 2;
    }
}



