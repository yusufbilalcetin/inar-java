package week_05.assignment;

public class Question_05_25 {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 10000 ; i <= 100000 ; i += 10000){
            for (int j = 1 ; j <= i ; j++){
                pi += 4 * (Math.pow((-1) , j + 1) / (2 * j - 1));
            }
            System.out.println(pi);
            pi = 0;
        }
    }
}
