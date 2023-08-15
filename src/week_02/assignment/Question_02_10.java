package week_02.assignment;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms:  ");
        double M = input.nextDouble();

        System.out.println("Enter the initial tempeture: ");
        double initialTempeture = input.nextDouble();

        System.out.println("Enter the final tempeture: ");
        double finalTempeture = input.nextDouble();

        double Q = M * (finalTempeture - initialTempeture) *4184;
        System.out.println("The energy needed is " + Q);

    }
}
