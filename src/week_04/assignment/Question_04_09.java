package week_04.assignment;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character : ");
        String myChar = input.next();

        System.out.println("the unicode for the character is " + (int)((char) myChar.charAt(0)));
    }
}
