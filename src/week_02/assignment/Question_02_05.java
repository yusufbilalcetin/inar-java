package week_02.assignment;

import java.util.Scanner;

public class Question_02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number Subtotal and gratuity rate: ");
        double gratuity = input.nextDouble();

        double subtotal = (gratuity / 100) * 15 ;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is "+ gratuity + " and total is " + total);




    }
}
