package week_06.assignment;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.println("Year     Days in year");

        System.out.println("Year     Days in year");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "         " + numberOfDaysInAYear(year));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return 366;
        else
            return 365;

    }
}


