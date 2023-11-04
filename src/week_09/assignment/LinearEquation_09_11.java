package week_09.assignment;

public class LinearEquation_09_11 {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double x;
    private double y;

    public LinearEquation_09_11(double a, double b, double c, double d,double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }
    public double getE(){
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        if (a * d - b * c == 0) {
            return false;
        } else {
            return true;
        }
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    public double getY(){
        return (a * f -e * c) / (a * d - b * c);
    }
}
