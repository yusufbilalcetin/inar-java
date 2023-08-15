package week_02.assignment;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000 : ");
        int sum = input.nextInt();

        int  number1 = sum % 10;
        int number2 = (sum % 100) / 10;
        int number3 = (sum % 1000) / 100 ;
        int digits = number1 + number2 + number3;

        System.out.println("The sum of the digits :" + digits);
    }
}
