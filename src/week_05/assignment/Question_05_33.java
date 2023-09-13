package week_05.assignment;

public class Question_05_33 {
    public static void main(String[] args) {

        System.out.println("Perfect numbers are : ");

        for (int i = 2; i <= 10000; i++) {
            int number = 0;
            for (int j = 1; j <= (i / 2); j++) {
                if (i % j == 0){
                    number += j;
                }
            }
            if (number == i){
                System.out.println(i);
            }
        }

    }
}
