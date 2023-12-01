package week_13.Question_13_09;

public class Circle extends GeometricObject implements Comparable<GeometricObject> {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean equals(Object o) {
        return this.compareTo((Circle) o) == 0;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + "\nRadius: " + this.radius + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }

}
