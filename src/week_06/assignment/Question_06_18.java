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
        boolean result = true;
        if (!isLenghtValid(str)) {
            System.out.println("");
            result = false;
        }
        if (!isLenghtValid(str)) {
            System.out.println("");
            result = false;
        }
        if (!isDigitOrLetters(str)) {
            System.out.println("");
            result = false;
        }
        if (!hasAtLeastTwoNumber(str)) {
            return false;
        }
        return result;
    }


    public static boolean isLenghtValid(String str) {
        return str.length() >= 8;
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

    public static boolean hasAtLeastTwoNumber(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch >= '9') {
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}



