package week_06.assignment;


public class Question_06_27 {
    public static void main(String[] args) {
        final int totalNumbers = 100;
        final int numbersPerLine = 10;
        printEmirps(numbersPerLine, totalNumbers);
    }

    public static void printEmirps(int numbersPerLine, int totalNumbers) {
        int counter = 1;
        int i = 2;
        while (counter <= totalNumbers) {
            if (isPrime(i) && isReversePrime(i) && !isPalindrome(i)) {
                System.out.print(i + " ");
                if (counter % 10 == 0 && counter != 0) {
                    System.out.println();
                }
                counter++;
            }
            i++;
        }
    }

    public static boolean isReversePrime(int number) {
        return isPrime(Integer.parseInt(reverseString("" + number)));
    }

    public static boolean isPrime(int number) {
        for (int j = 2; j < (number / 2 + 1); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        String str = "" + number;

        return str.equals(reverseString(str));
    }

    public static String reverseString(String str) {
        String controlStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            controlStr += str.charAt(i);
        }
        return controlStr;
    }
}
