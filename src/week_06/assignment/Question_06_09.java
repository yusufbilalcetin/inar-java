package week_06.assignment;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet     Meters    |     Meters     Feet\n" +
                "---------------------------------------------------");
        for (double feet = 1.0, meters = 20; feet <= 10.0; feet++, meters += 20) {
            System.out.printf("%4.1f     ", feet);
            System.out.printf("%4.3f", footToMeter(feet));
            System.out.print("     |     ");
            System.out.printf("%-10.1f", meters);
            System.out.printf("%6.3f\n", meterToFoot(meters));

        }

    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
