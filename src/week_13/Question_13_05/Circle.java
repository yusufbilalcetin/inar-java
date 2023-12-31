package week_13.Question_13_05;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();

    }
}
