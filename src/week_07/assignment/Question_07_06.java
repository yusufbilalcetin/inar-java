package week_07.assignment;

public class Question_07_06 {
    public static void main(String[] args) {
        int[] primeNumber = new int[50];
        primeNumber[0] = 2;
        int number = 3;
        int i = 1;
        while (i < primeNumber.length) {
            boolean isPrime = true;
            for (int j = 0; primeNumber[j] <= Math.sqrt(number); j++) {
                if (number % primeNumber[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumber[i] = number;
                i++;
            }
            number++;
        }
        for (i = 0; i < primeNumber.length; i++) {
            if (i % 10 == 9)
                System.out.printf("%5d\n", primeNumber[i]);
            else
                System.out.printf("%5d", primeNumber[i]);
        }
    }
}

