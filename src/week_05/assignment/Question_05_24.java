package week_05.assignment;

public class Question_05_24 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;


        for (double i = 1; i <= 97; i += 2) {
            sum1 += (i / i + 2);
        }
        for (double i = 97; 1 <= i; i -= 2) {
            sum2 += (i / (i + 2));
        }
        System.out.println(sum2);
    }
}
