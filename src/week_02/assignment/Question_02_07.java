package week_02.assignment;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of minutes: ");
        int minutes = input.nextInt();

        int years = ((minutes / 60) / 24) / 365;
        int days = ((minutes / 60) / 24) % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");



    }
}
