package week_09.assignment;

public class Rectangle_09_01 {
    double width;
    double height;

    public Rectangle_09_01() {
        this(4, 40);
    }
    public Rectangle_09_01(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (width * height);
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

}
