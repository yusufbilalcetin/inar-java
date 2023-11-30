package week_13.Question_13_06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {

    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (super.getArea() > o.getArea()) {
            return 1;
        } else if (super.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
