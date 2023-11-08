package week_10.assignment;

public class MyPoint_10_04 {
    private double x;
    private double y;

    public MyPoint_10_04() {
    }

    public MyPoint_10_04(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint_10_04 myPoint) {
        return Math.sqrt(Math.pow(this.getX() - myPoint.getX(), 2) + Math.pow(this.getY() - myPoint.getY(), 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.getX() - x, 2) + Math.pow(this.getY() - y, 2));
    }
}
