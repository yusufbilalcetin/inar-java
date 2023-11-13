package week_10.assignment;

import java.math.BigInteger;
public class Question_10_19 {
    public static void main(String[] args) {
        System.out.println("p       2^p - 1");
        for (BigInteger p = new BigInteger("2"); p.compareTo(new BigInteger("100")) <= 0; p = p.add(BigInteger.ONE)) {

            if (Question_10_18.isPrime(p)) {
                System.out.printf("%-3d", p);
                System.out.println("       " + mersennePrime(p));
            }
        }
    }

    public static BigInteger mersennePrime(BigInteger n) {
        BigInteger two = new BigInteger("2");
        BigInteger x = new BigInteger("2");
        for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            x = x.multiply(two);
        }
        return x.subtract(BigInteger.ONE);
    }
}

