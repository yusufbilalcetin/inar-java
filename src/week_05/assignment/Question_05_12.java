package week_05.assignment;


public class Question_05_12 {
    public static void main(String[] args) {

        double n = Math.sqrt(12500);

        while (n > Math.sqrt(12000)) {
            n -= 0.1;
        }
        System.out.println("the smallest n is " + Math.round(n));
    }
}
