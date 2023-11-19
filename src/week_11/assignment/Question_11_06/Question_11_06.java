package week_11.assignment.Question_11_06;

import week_10.assignment.Circle2D_10_11;
import week_10.live_class.Loan;

import java.util.ArrayList;
import java.util.Date;
public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Loan loan = new Loan(2.5,1,1000);
        Date date = new Date();
        String str = new String("InarAcademy");
        Circle2D_10_11 circle = new Circle2D_10_11();
        objects.add(loan);
        objects.add(date);
        objects.add(str);
        objects.add(circle);
        for (int i = 0; i <objects.size() ; i++) {
            System.out.println(objects.get(i).toString());
            System.out.println("------------------------");
        }
    }
}
