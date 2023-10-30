package week_09.assignment;

public class Question_09_01_01 {
    double width;
    double height;

    public Question_09_01_01() {
        this(4, 40);
    }
    public Question_09_01_01(double width, double height) {
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
