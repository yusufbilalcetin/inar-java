package week_03.assignment;

import java.util.Scanner;

public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the mounth as integer : ");
        int month = input.nextInt();

        System.out.println("Enter the year as integer : ");
        int year = input.nextInt();

        int daysInMonths = 0;
        switch (month) {
            case 1:
                daysInMonths = 31;
                System.out.println("January" + year + " had " + daysInMonths + " days");
                break;
            case 3:
                daysInMonths = 31;
                System.out.println("march "  + year + " had " + daysInMonths + " days");
                break;
            case 5:
                daysInMonths = 31;
                System.out.println("May " + year + " had " + daysInMonths + " days");
                break;
            case 7:
                daysInMonths = 31;
                System.out.println("July " + year + " had " + daysInMonths + " days");
                break;
            case 8:
                daysInMonths = 31;
                System.out.println("august " + year + " had " + daysInMonths + " days");
                break;
            case 10:
                daysInMonths = 31;
                System.out.println("september " + year + " had " + daysInMonths + " days");
                break;
            case 12:
                daysInMonths = 31;
                System.out.println("december " + year + " had " + daysInMonths + " days");
                break;
            case 4:
                daysInMonths = 30;
                System.out.println("april " + year + " had " + daysInMonths + " days");
                break;
            case 6:
                daysInMonths = 30;
                System.out.println("June " + year + " had " + daysInMonths + " days");
                break;
            case 9:
                daysInMonths = 30;
                System.out.println("Semtember" + year + " had " + daysInMonths + " days");
                break;
            case 11:
                daysInMonths = 30;
                System.out.println("November " + year + " had " + daysInMonths + " days");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonths = 29;
                    System.out.println("January " + year + " had " + daysInMonths + " days");
                } else {
                    daysInMonths = 28;
                    System.out.println("January " + year + " had " + daysInMonths + " days");
                }
                break;

        }

    }
}

