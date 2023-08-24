package week_03.assignment;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of the triangle: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if(number1 + number2 > number3 && number1 + number3 > number2 && number2 + number3 > number1){
            double perimeterOfTriangle = number1 + number2 + number3;
            System.out.println("The perimeter of the triangle is " + perimeterOfTriangle);
        }else {
            System.out.println("The input is invalid ");
        }
    }
}
