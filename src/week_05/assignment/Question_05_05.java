package week_05.assignment;

public class Question_05_05 {
    public static void main(String[] args) {
        final double RATE = 2.2;
        System.out.println("Kilograms   Pounds     |          Pounds        Kilograms");

        for (int i = 1 , y = 20 ; i < 200 && y < 516 ; i += 2 , y += 5 ) {
            System.out.printf("%-12d%6.1f%6s%10s" , i , i * 2.2 ,"|" , "          " );
            System.out.printf("%-12d%11.2f" , y , y / RATE);
            System.out.println();

        }
    }
}
