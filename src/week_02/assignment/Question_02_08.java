package week_02.assignment;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");

        long timeZoneOffset = input.nextLong();
        long totalmilliseconds = System.currentTimeMillis();

        long totalseconds = totalmilliseconds / 1000;
        long currentsecond = totalseconds % 60;

        long totalminutes = totalseconds / 60;
        long currentminutes = totalminutes % 60;

        long totalhours = totalminutes / 60;
        long currenthours = (totalhours + timeZoneOffset) % 24;

        System.out.println("The current time is " + currenthours + ":" + currentminutes +
                ":" + currentsecond + " GMT ");
    }
}
