package week_09.assignment;

public class QuadraticEquation_09_10 {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation_09_10(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - (4 * a * c));
        // 4 - (4 * 1 * 1)
        // 4 - 4 = 0 ;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
        }
        return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        }
        return 0;
    }
}
