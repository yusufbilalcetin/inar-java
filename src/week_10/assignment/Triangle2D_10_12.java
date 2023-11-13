package week_10.assignment;

public class Triangle2D_10_12 {
    private MyPoint_10_04 p1;
    private MyPoint_10_04 p2;
    private MyPoint_10_04 p3;

    public Triangle2D_10_12() {
        this(new MyPoint_10_04(0, 0), new MyPoint_10_04(1, 1), new MyPoint_10_04(2, 5));
    }

    public Triangle2D_10_12(MyPoint_10_04 p1, MyPoint_10_04 p2, MyPoint_10_04 p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint_10_04 getP1() {
        return p1;
    }

    public void setP1(MyPoint_10_04 p1) {
        this.p1 = p1;
    }

    public MyPoint_10_04 getP2() {
        return p2;
    }

    public void setP2(MyPoint_10_04 p2) {
        this.p2 = p2;
    }

    public MyPoint_10_04 getP3() {
        return p2;
    }

    public void setP3(MyPoint_10_04 p3) {
        this.p3 = p3;
    }

    public double getArea() {
        return Math.abs((p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY())) / 2);

    }

    public double getPerimeter() {
        double side1 = Math.pow(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2), 0.5);
        double side2 = Math.pow(Math.pow((p2.getX() - p3.getX()), 2) + Math.pow((p2.getY() - p3.getY()), 2), 0.5);
        double side3 = Math.pow(Math.pow((p1.getX() - p3.getX()), 2) + Math.pow((p1.getY() - p3.getY()), 2), 0.5);

        return side1 + side2 + side3;
    }

    public boolean contains(MyPoint_10_04 p) {
        double areaPP1P2 = Math.abs((p.getX() * (p1.getY() - p2.getY()) + p1.getX() * (p2.getY() - p.getY()) + p2.getX() * (p.getY() - p1.getY())) / 2);
        double areaPP2P3 = Math.abs((p.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p.getY()) + p3.getX() * (p.getY() - p2.getY())) / 2);
        double areaPP1P3 = Math.abs((p.getX() * (p1.getY() - p3.getY()) + p1.getX() * (p3.getY() - p.getY()) + p3.getX() * (p.getY() - p1.getY())) / 2);

        return (areaPP1P2 + areaPP2P3 + areaPP1P3) == this.getArea();
    }

    public boolean contains(Triangle2D_10_12 t) {
        return (contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3()));
    }

    public boolean overlaps(Triangle2D_10_12 t) {
        return (contains(t.getP1()) || contains(t.getP2()) || contains(t.getP3())) || (t.contains(this.getP1()) || t.contains(this.getP2()) || t.contains(this.getP3()));
    }

}
