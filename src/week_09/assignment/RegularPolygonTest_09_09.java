package week_09.assignment;

public class RegularPolygonTest_09_09 {
    public static void main(String[] args) {
        RegularPolygon_09_09 regularPolygon1 = new RegularPolygon_09_09();
        RegularPolygon_09_09 regularPolygon2 = new RegularPolygon_09_09(6, 4);
        RegularPolygon_09_09 regularPolygon3 = new RegularPolygon_09_09(10, 4, 5.6, 7.8);

        System.out.println("First RegularPolygon perimeter is: " + regularPolygon1.getPerimeter() + " area is " + regularPolygon1.getArea());
        System.out.println("First RegularPolygon perimeter is: " + regularPolygon2.getPerimeter() + " area is " + regularPolygon2.getArea());
        System.out.println("First RegularPolygon perimeter is: " + regularPolygon3.getPerimeter() + " area is " + regularPolygon3.getArea());


    }
}
