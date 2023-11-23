package week_12.assignment.Question_12_08;

import java.util.Scanner;

public class HexToDecWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");

        try {
            String hex = input.nextLine();
            System.out.println("The decimal value for hex number " + hex
                    + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException ex) {
            System.out.println(ex);
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if((hexChar < 'A' || hexChar > 'F' ) && (hexChar < '0' || hexChar > '9')){
                throw new HexFormatException("It is not a hex string.!");
            }
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}
