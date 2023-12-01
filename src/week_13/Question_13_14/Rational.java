package week_13.Question_13_14;

public class Rational extends Number implements Comparable<Rational> {
    private long[] r = new long[2];

    public Rational() {
        this(0, 1);
    }

    public Rational(long numarator, long denominator) {
        long gcd = gcd(numarator, denominator);
        this.r[0] = ((denominator > 0) ? 1 : -1) * numarator / gcd;
        this.r[1] = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    public Rational add(Rational secondRational) {
        long n = this.r[0] * secondRational.getDenominator() +
                this.r[1] * secondRational.getNumerator();
        long d = this.r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator()
                - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.r[0];
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1) {
            return r[0] + "";
        } else {
            return r[0] + "/" + r[1];
        }
    }

    @Override
    public boolean equals(Object other) {
        return ((this.subtract((Rational) (other))).getNumerator() == 0);
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
