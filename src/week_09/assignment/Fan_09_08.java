package week_09.assignment;

public class Fan_09_08 {
    private int speed;
    private boolean on;
    private double radius;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    String color = "blue";

    public Fan_09_08() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (on){
            return "Fan speed: " + getSpeed() + ", Color : " + getColor() + ", radius: " + getRadius();
        }else {
            return "Fan color: " + getColor() + ", radius : " + getRadius() + "\nFan is off";
        }
    }


}
