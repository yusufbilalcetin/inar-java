package week_05.assignment;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of lines ");
        int numberOfLines = input.nextInt();

        for (int i = 1; i <= numberOfLines; i++) {
            System.out.println(i);

        }
    }
}
