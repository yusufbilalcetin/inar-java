package week_10.live_class;

import java.sql.Time;

public class StackOfIntegerTest {
    public static void main(String[] args) {
        StackOfInteger stackOfInteger = new StackOfInteger();

        for (int i = 0; i < 10; i++) {
            stackOfInteger.push(i);
        }
        while (!stackOfInteger.empty()) {
            System.out.print(stackOfInteger.pop() + " ");
        }
    }
}
