package week_04.assignment;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code : ");

        int character = input.nextInt();

        if (character >= 0 && character <= 127) {
            System.out.println("the character for ASCII code "
                    + character + " is " + ((char) character));
        } else {
            System.out.println("invalid input");
        }
    }
}
