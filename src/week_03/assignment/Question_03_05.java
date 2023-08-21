package week_03.assignment;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day : ");
        double days = input.nextDouble();
        System.out.println("Enter the number elapsed since today : ");
        double numberOfDays = input.nextDouble();


        double total = (days + numberOfDays) % 7 ;
        System.out.print("today is ");

        if (days == 0){
            System.out.print("sunday");
        }else if (days == 1){
            System.out.print("monday");
        }else if (days == 2){
            System.out.print("tuesday");
        }else if (days == 3){
            System.out.print("wednesday");
        }else if (days == 4){
            System.out.print("thursday");
        }else if (days == 5){
            System.out.print("friday");
        }else if (days == 6){
            System.out.print("saturday");
        }

        System.out.print(" and the future day is ");

        if (total == 0){
            System.out.println("sunday");
        }else if (total == 1){
            System.out.println("monday");
        }else if (total == 2){
            System.out.println("tuesday");
        }else if (total == 3){
            System.out.println("wednesday");
        }else if (total == 4){
            System.out.println("thursday");
        }else if (total == 5){
            System.out.println("friday");
        }else if (total == 6) {
            System.out.println("saturday");
        }
    }
}
