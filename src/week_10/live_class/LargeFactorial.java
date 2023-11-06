package week_10.live_class;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            result = result.multiply(new BigInteger(i + " "));
        }
        return result;
    }
}
