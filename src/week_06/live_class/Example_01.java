package week_06.live_class;

import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = input.next();
        System.out.print("enter a number: ");
        int count = input.nextInt();

        printWord(str, count);

    }

    public static void printWord(String str, int count) {
        String newStr = "";
        if (str.contains(" ")) {
            newStr = str.substring(0, str.indexOf(' '));
        } else {
            newStr = str;
        }
        for (int i = 0; i <= count; i++) {
            System.out.print(newStr);
        }
    }
}
