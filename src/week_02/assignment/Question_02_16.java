package week_02.assignment;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double s = input.nextDouble();

        double area = Math.pow(3 , 1.5) / 2 * Math.pow(s , 2);
        System.out.println("the area of the hexagon is " + area);
    }
}
