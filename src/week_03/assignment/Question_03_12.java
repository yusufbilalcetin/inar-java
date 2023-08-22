package week_03.assignment;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a three-digit integer ");
        int number1 = input.nextInt();

        int temp = number1 % 10;
        int temp2 = number1 % 100;
        temp2 = number1 / 100;

        if (temp == temp2){
            System.out.println(number1 + " is a polindrome");
        }else {
            System.out.println(number1 + " is not a palindrome");
        }


    }
}
