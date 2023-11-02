package week_09.assignment;

import week_05.live_class.GuessNumberOneTime;

import java.util.GregorianCalendar;

public class GregorianCalender_09_05 {
    public static void main(String[] args) {

        GregorianCalendar calender = new GregorianCalendar();

        System.out.println("Current year: " + calender.get(GregorianCalendar.YEAR));
        System.out.println("Current year: " + calender.get(GregorianCalendar.MONTH));
        System.out.println("Current year: " + calender.get(GregorianCalendar.DAY_OF_MONTH));


        System.out.println("--------------------------");
        System.out.println("  after   set    time ");
        System.out.println("--------------------------");

        calender.setTimeInMillis(1234567898765L);

        System.out.println("Current year: " + calender.get(GregorianCalendar.YEAR));
        System.out.println("Current year: " + calender.get(GregorianCalendar.MONTH));
        System.out.println("Current year: " + calender.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
