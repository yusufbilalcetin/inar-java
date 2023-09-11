package week_05.assignment;

public class Question_05_26 {
    public static void main(String[] args) {
        double e = 0;
        double item = 0;

        for (int i = 1000; i <= 100000; i += 10000) {
            for (int j = 1; j <= i; j++) {
                item /= j;
                e += item;
            }
            System.out.println(e);
            e = 1;
            item = 1;
        }
    }
}
