package week_09.assignment;

import java.util.Date;

public class DateTest_09_03 {
    public static void main(String[] args) {
        Date date = new Date();

        for (int i = 4; i < 12; i++) {
            long elapsedTime = (long) (Math.pow(10, i));
            date.setTime(elapsedTime);
            System.out.println("For elapsed " + elapsedTime + " time is : " + date.toString());
        }
    }
}


