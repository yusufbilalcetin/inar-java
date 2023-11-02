package week_09.assignment;

import java.util.Random;

public class Random_09_04 {
    public static void main(String[] args) {

        Random random = new Random(100);

        System.out.println("Random Numbers are: \n");

        for (int i = 1; i <= 50; i++) {
            if (i % 10 == 0) {
                System.out.println(random.nextInt(100));
            } else {
                System.out.print(random.nextInt(100) + " ");
            }
        }
    }
}
