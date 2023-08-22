package week_03.assignment;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer :");
        int number = input.nextInt();

        int d9 = number % 10;
        number = number / 10;

        int d8 = number % 10;
        number = number / 10;

        int d7 = number % 10;
        number = number / 10;,

        int d6 = number % 10;
        number = number / 10;

        int d5 = number % 10;
        number = number / 10;

        int d4 = number % 10;
        number = number / 10;

        int d3 = number % 10;
        number = number / 10;

        int d2 = number % 10;
        number = number / 10;
        
        int d1 = number % 10;
        number = number / 10;

        int firstNineOfDigit = ((d1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5)
                + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);

        if (firstNineOfDigit == 10){
            System.out.println("X");
        }else {
            System.out.println(firstNineOfDigit);
        }
    }
}
