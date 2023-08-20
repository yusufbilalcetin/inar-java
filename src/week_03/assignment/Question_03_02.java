package week_03.assignment;

import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);


            System.out.println("what is " + number1 + " + " + number2 + " + " + number3 + " ? ");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();

            if(number1 + number2 + number3 == answer) {
                System.out.println(number1 + " + " + number2 + " +  " + number3 + " = " + answer + " is true");
            } else
                System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is false");
            }



    }

