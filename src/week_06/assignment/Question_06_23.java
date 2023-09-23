package week_06.assignment;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string :");
        String string = input.nextLine();

        System.out.print("Enter a character that you want to count : ");
        String str = input.nextLine();

        char ch = str.charAt(0);

        System.out.println(count(string, ch));


    }

    public static int count(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
                count++;
            }
        }
        return count;
    }
}