package week_05.live_class;

import java.util.Scanner;

public class VowelLetterQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text : ");
        String text = input.next();

        int count = 0;
        char c;

        for (int i = 0; i < text.length(); i++) {
            c = Character.toLowerCase(text.charAt(i));
            System.out.println(c);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
