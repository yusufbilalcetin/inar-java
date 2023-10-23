package week_08.assignment;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        String s = Integer.toBinaryString(number);
        String b = "";

        for (int i = 0; i < 9 - s.length(); i++) {
            b += "0";
        }
        String binary = b + s;

        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print((binary.charAt(a) == '1' ? 'T' : 'H') + " ");
                a++;
            }
            System.out.println();
        }
    }
}
