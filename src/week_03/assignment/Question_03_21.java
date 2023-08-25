package week_03.assignment;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year :");
        int year = input.nextInt();

        System.out.print("Enter month : 1-12 :");
        int month = input.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid value");                                                                            //////////////
        }


        System.out.print("Enter the day of the month : 1-31 : ");
        int day = input.nextInt();
        if (day < 0 || day > 31) {
            System.out.println("Invalid value");
        }

        int dayOfTheWeek = (day + ((26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7;


        switch (dayOfTheWeek) {
            case 0:
                System.out.println("Day of the week is Monday");
                break;
            case 1:
                System.out.println("Day of the week is Tuesday");
                break;
            case 2:
                System.out.println("Day of the week is Wednesday");
                break;
            case 3:
                System.out.println("Day of the week is Thursday");
                break;
            case 4:
                System.out.println("Day of the week is Friday");
                break;
            case 5:
                System.out.println("Day of the week is Saturday");
                break;
            case 6:
                System.out.println("Day of the week is Sunday");
                break;
        }
    }
}
