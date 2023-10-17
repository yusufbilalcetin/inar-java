package week_07.assignment;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        String zodiacYear = zodiac(year);
        System.out.print(year + " is a year of " + zodiacYear + " in zodiac");
    }

    public static String zodiac(int year) {
        String[] zodiacYears = {"Monkeys", "rooster", "dog", "pit", "rat", "ox", "tiger", "rabbit",
                "dragon", "snake", "horse", "sheep"};
        return zodiacYears[year % 12];
    }
}
