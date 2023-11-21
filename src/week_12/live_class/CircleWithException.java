package week_12.live_class;

public class CircleWithException {
    private double radius;

    private static int numberOfObjects = 0;


    public CircleWithException() {
        this(1.0);
    }


    public CircleWithException(double newRadius) {

        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double newRadius) {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
    }


    public static int getNumberOfObjects() {
        return numberOfObjects;
    }


    public double findArea() {
        return radius * radius * 3.14159;
    }

}
