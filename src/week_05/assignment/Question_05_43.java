package week_05.assignment;

public class Question_05_43 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                System.out.println(i + " " + j);
                counter++;
            }
        }
        System.out.println("The total number of all combinations is " + counter);
    }
}
