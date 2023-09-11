package week_05.assignment;

public class Question_05_23 {
    public static void main(String[] args) {
        double total1 = 0;
        double total2 = 0;

        System.out.print("Summation of series left to right :");
        for (int i = 1 ; i <= 50000 ; i ++){
            total1 += (1.0 / i);
        }
        System.out.println(total1);

        System.out.print("Summation of series left to right :");
        for (int i = 50000 ; 1 <= i ; i--){
            total2 += (1.0 / i);
        }
        System.out.println(total2);

        System.out.println("Summation of series rgiht to left -Summation of the series left to right : " + total1 * total2);
    }
}
