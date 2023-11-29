package week_13.Question_13_01;

import java.util.Date;

public abstract class GeometricObject {
    boolean filled;
    String color;
    Date datecreated;

    public GeometricObject(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.datecreated = datecreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "GeometricObject" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                ", datecreated=" + datecreated;
    }

    public abstract double getArea();
}
