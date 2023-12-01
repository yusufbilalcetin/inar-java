package week_13.Question_13_12;

public class Circle extends GeometricObject {
    private double radius;

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
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return super.toString() + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }
}
