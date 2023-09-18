package week_06.assignment;

public class Question_06_12 {
    public static void main(String[] args) {
        System.out.println("Characters per 1 to Z :");
        char ch1 = '1';
        char ch2 = 'Z';
        final int NUMBER_PER_LINES = 10;
        printchars(ch1, ch2, NUMBER_PER_LINES);

    }

    public static void printchars(char ch1, char ch2, int numberPerLines) {
        for (char i = ch1, count = 1; i <= ch2; i++, count++) {
            if (count % numberPerLines == 0)
                System.out.println(i);
            else
                System.out.print(i + " ");
        }
    }
}
