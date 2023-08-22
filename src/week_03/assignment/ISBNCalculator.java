package week_03.assignment;

import java.util.Scanner;

public class ISBNCalculator {
    public static void main(String[] args) {
        // Get the first 9 digits from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of the ISBN-10: ");
        String firstNineDigits = input.nextLine();

        // Check if the input contains 9 digits
        if (firstNineDigits.length() != 9 || !firstNineDigits.matches("\\d+")) {
            System.out.println("Invalid input. Please enter 9 digits.");
        } else {
            // Calculate the checksum digit
            int checksum = 0;
            for (int i = 0; i < 9; i++) {
                checksum = (checksum + (i + 1) * Character.getNumericValue(firstNineDigits.charAt(i))) % 11;
            }

            // Determine the final digit (or 'X' for checksum 10)
            String isbn10;
            if (checksum == 10) {
                isbn10 = firstNineDigits + "X";
            } else {
                isbn10 = firstNineDigits + checksum;
            }

            // Display the complete 10-digit ISBN
            System.out.println("The 10-digit ISBN is: " + isbn10);
        }
    }
}

