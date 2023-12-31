package week_06.assignment;

import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        printCalendarHeader(month, year);
        printFirstDay(month, year);
        printCalendar(month, year);
    }

    public static void printCalendarHeader(int month, int year) {
        System.out.print(getMonthName(month) + "\t");
        System.out.println(year);
        System.out.println("---------------------------");

        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "November";
            case 11:
                return "October";
            case 12:
                return "December";

        }
        return null;
    }

    public static void printFirstDay(int month, int year) {
        int firstDay = zeller(1, month, year);
        String dayInMonth = "1";

        for (int i = 1; i < firstDay; i++) {
            dayInMonth = "\t" + dayInMonth;
        }
        if (firstDay == 0) {
            dayInMonth = "1";
        }

        System.out.print(dayInMonth + "\t");
    }

    public static void printCalendar(int month, int year) {

        int lastDayOfMonth = totalDayOfMonth(month, year);

        for (int i = 2; i <= lastDayOfMonth; i++) {
            int printedDay = zeller(i, month, year);
            if (printedDay == 1) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }
    }

    public static int zeller(int dayOfMonth, int month, int year) {
        if (month == 1 || month == 2) {
            month = month + 12;
            year--;
        }
        int q, m, j, k;
        q = dayOfMonth;
        m = month;
        j = year / 100;
        k = year % 100;
        return (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + (5 * j)) % 7;
    }

    public static int totalDayOfMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return isLeapYear(year) ? 29 : 28;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}


