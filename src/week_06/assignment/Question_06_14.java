package week_06.assignment;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.println("\ni           m(i)     ");
        System.out.println("---------------------");

        double seriesStart = 1;
        double seriesEnd = 901;

        for (double i = seriesStart; i <= seriesEnd; i += 100) {
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", estimate(i));
        }

    }

    public static double estimate(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
        }
        return sum;
    }
}
