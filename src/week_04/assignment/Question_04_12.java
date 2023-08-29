package week_04.assignment;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit : ");
        String number = input.nextLine();

        if (number.length() != 1) {
            System.out.println("The input is invalid.");
            System.exit(1);
        }
        char ch = number.charAt(0);
        if ((ch <= 'F' && ch >= 'A') || ('1' <= ch && ch <= '9')) {
            System.out.print("The binary value is ");
            if (number.equals("0")) {
                System.out.println(number);
            } else if (number.equals("1")) {
                System.out.println(number);
            } else if (number.equals("2")) {
                System.out.println("10");
            } else if (number.equals("3")) {
                System.out.println("11");
            } else if (number.equals("4")) {
                System.out.println("100");
            } else if (number.equals("5")) {
                System.out.println("101");
            } else if (number.equals("6")) {
                System.out.println("110");
            } else if (number.equals("7")) {
                System.out.println("111");
            } else if (number.equals("8")) {
                System.out.println("1000");
            } else if (number.equals("9")) {
                System.out.println("1001");
            } else if (number.equals("A")) {
                System.out.println("1010");
            } else if (number.equals("B")) {
                System.out.println("1011");
            } else if (number.equals("C")) {
                System.out.println("1100");
            } else if (number.equals("D")) {
                System.out.println("1101");
            } else if (number.equals("E")) {
                System.out.println("1110");
            } else if (number.equals("F")) {
                System.out.println("1111");
            }
        }
    }
}