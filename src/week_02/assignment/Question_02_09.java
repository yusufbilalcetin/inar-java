package week_02.assignment;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1 and t :");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double average = (v1 - v0) / t;
        System.out.println("the average acceleration is " + average);
    }
}
