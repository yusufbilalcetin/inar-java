package week_07.assignment;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] randomDigit = new int[10];
        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 10);
            randomDigit[number]++;
        }
        System.out.println("Count for each number between 0 and 9 :");
        for (int i = 0; i < randomDigit.length ; i++) {
            System.out.println(i + "s: " + randomDigit[i]);

        }

    }
}
