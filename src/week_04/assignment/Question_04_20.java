package week_04.assignment;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = input.nextLine();

        System.out.println("Length of the string: " + str.length());

        System.out.println("First chacracter of the string:" + " " + str.charAt(0));
    }
}
