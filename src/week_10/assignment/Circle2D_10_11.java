package week_10.assignment;

public class Circle2D_10_11 {
    private double x;
    private double y;
    private double radius;

    public Circle2D_10_11() {
        this(0, 0, 1);
    }

    public Circle2D_10_11(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        if (Math.sqrt(Math.pow((this.x - x), 2) + Math.pow(this.y - y, 2)) <= radius) {
            return true;
        }
        return false;

    }

    public boolean contains(Circle2D_10_11 circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))
                <= Math.abs(radius - circle.getRadius());
    }

    public boolean overlaps(Circle2D_10_11 circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))
                <= radius + circle.getRadius();
    }
}
