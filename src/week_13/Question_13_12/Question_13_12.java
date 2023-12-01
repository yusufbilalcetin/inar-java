package week_13.Question_13_12;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] object = {new Circle("Blue", true, 12),
                new Circle("Green", false, 15),
                new Rectangle("Purple", true, 32, 12),
                new Rectangle("Black", false, 23, 19)};

        System.out.printf("Total area of Geometric Objects: %.2f ", sumArea(object));
    }

    public static double sumArea(GeometricObject[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getArea();
        }
        return sum;
    }

}
