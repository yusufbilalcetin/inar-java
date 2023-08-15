package week_02.assignment;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance : ");
        double drivingOfDistance = input.nextDouble();

        System.out.println("Enter miles per gallon : ");
        double milesOfGallon = input.nextDouble();

        System.out.println("Enter price per gallon : ");
        double priceOfGallon = input.nextDouble();

        double costOfDriving = drivingOfDistance / milesOfGallon * priceOfGallon;
        System.out.println("the cost of driving is " + costOfDriving);


    }
}
