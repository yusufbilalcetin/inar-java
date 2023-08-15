package week_02.assignment;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weigth in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        double kilograms = weight * 0.45359237;

        double meters = height * 0.0254;

        System.out.println("BMI is " + kilograms / Math.pow(meters , 2));
    }
}
