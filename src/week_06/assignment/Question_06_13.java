package week_06.assignment;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i        m(i)    \n" +
                "-------------------------------");

        double seriesStart = 1.0;
        double numberOfRows = 20.0;

        for (double i = seriesStart; i <= numberOfRows; i++) {
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", sumSeries(i));
        }
    }

    public static double sumSeries(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }
}

