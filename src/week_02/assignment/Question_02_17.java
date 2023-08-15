package week_02.assignment;

import java.util.Scanner;

public class Question_02_17 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF :");
        double outsideTemp = input.nextDouble();
        double wc = 35.74 + 0.6215 - Math.pow(35.75 , 0.16) + Math.pow(0.4275 , 0.16);

        

        System.out.println("Enter the wind speed (>=2) in miles per hour : ");
        double windSpeed = input.nextDouble();
        double chill = Math.pow(wc , windSpeed);
        System.out.println("The windSpeed chill index is " + chill);


    }
}
