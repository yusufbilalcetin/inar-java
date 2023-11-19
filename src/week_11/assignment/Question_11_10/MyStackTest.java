package week_11.assignment.Question_11_10;

import java.util.Scanner;

public class MyStackTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack myStack = new MyStack();
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            myStack.push(input.next());
        }
        System.out.println("Stack: "+ myStack);

        System.out.println("Displaying them in reverse order..");
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop() + " ");
        }
    }
}
