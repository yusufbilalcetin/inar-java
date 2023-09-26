package week_06.assignment;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds :");
        long millis = input.nextLong();
        System.out.printf("hours:minutes:seconds: %s", convertMillis(millis));
    }



    public static String convertMillis(long milliseconds) {
        long hours = milliseconds / (1000 * 60 * 60);
        milliseconds -= hours * (1000 * 60 * 60);
        long minutes = milliseconds / (1000 * 60);
        milliseconds -= minutes * (1000 * 60);
        long seconds = milliseconds / 1000;
        return hours + ":" + minutes + ":" + seconds;
    }
}
