package week_13.Question_13_01;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        getInformationFromUser();
    }

    private static void getInformationFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three side of the triangle :");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        System.out.println("Enter the color: ");
        String color = input.next();

        System.out.println("Enter: IsFilled ? true or false: ");
        boolean filled = input.hasNextBoolean();
        input.close();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println("\n" + triangle);
    }
}
