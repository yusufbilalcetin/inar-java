package week_06.assignment;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle : ");
        double number1 = input.nextInt();
        double number2 = input.nextInt();
        double number3 = input.nextInt();

        if (isValid(number1, number2, number3)) {
            System.out.println("the area of the triangle is " + area(number1, number2, number3));
        } else {
            System.out.println("!!invalid input!!");
        }
    }


    public static boolean isValid(double side1, double side2, double side3) {
        //TODO
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
    }

}
