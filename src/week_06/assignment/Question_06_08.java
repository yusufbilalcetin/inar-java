package week_06.assignment;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius   Fahrenheit    |    Fahrenheit   Celsius\n" +
                "----------------------------------------------------------");

        for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
            System.out.printf("%-12.1f", celsius);
            System.out.printf("%-12.1f|", celciusToFahreint(celsius));
            System.out.printf("     %-12.1f", fahrenheit);
            System.out.printf("%6.2f\n\n", fahrenheitTocelcius(fahrenheit));
        }


    }

    public static double celciusToFahreint(double celsius) {
        return (9.0 / 5) * (celsius + 32);
    }

    public static double fahrenheitTocelcius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
