package week_02.assignment;

import java.util.Scanner;

public class Question_02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number for pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds *  0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
