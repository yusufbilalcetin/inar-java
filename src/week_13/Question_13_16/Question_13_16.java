package week_13.Question_13_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question_13_16 {
    public static void main(String[] args) {
       /*
        if (args.length != 1 || !args[0].matches("\\d+/\\d+ [\\\\+\\\\-\\\\* /] \\d+/\\d+")) {
           System.out.println("Usage java Question_13_16 \"num1/num2 (+,-,/,*) num3/num4\"");
           return;
        }
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter operation as follows -> 3/4 - 4/4");
        String str = input.nextLine();
        input.close();

        int index = findOperatorIndex(str);
        String[] parts = str.split("\\s*[+*/-]\\s*");
        ArrayList<String> numbers = new ArrayList<>();
        for (String part : parts) {
            String[] twoNumbers = part.split("/");
            Collections.addAll(numbers, twoNumbers);
        }
        Rational number1 = new Rational(Long.parseLong(numbers.get(0)), Long.parseLong(numbers.get(1)));
        Rational number2 = new Rational(Long.parseLong(numbers.get(2)), Long.parseLong(numbers.get(3)));
        System.out.print(number1 + " " + str.charAt(index) + " " + number2 + " = ");
        switch (str.charAt(index)) {
            case '+' -> System.out.println(number1.add(number2));
            case '-' -> System.out.println(number1.subtract(number2));
            case '/' -> System.out.println(number1.divide(number2));
            case '*' -> System.out.println(number1.multiply(number2));
        }

    }

    private static int findOperatorIndex(String input) {
        Pattern pattern = Pattern.compile("[+*/-]");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
            if (count == 2) {

                return matcher.start();
            }
        }
        return -1;
    }
}
