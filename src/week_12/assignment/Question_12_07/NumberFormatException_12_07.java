package week_12.assignment.Question_12_07;

import java.util.Scanner;

public class NumberFormatException_12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        try {
            String bin = input.nextLine();
            System.out.println("The decimal value for binary number " +
                    bin + " is " + binToDecimal(bin));
        } catch (NumberFormatException ex) {
            System.out.println("It is not binary string.");
        }
    }

    public static int binToDecimal(String bin) {
        int decimalNumber = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1') {
                throw new NumberFormatException();
            }
            decimalNumber += Integer.parseInt(bin.charAt(i) + "") * (int) (Math.pow(2, bin.length() - 1 - i));
        }
        return decimalNumber;
    }
}
