package week_13.Question_13_08;

import week_13.Question_13_06.Circle;

public class Question_13_08 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack myStack1 = new MyStack();
        System.out.println("Pushing the nuber 4,5 and 6 to 1st stack..");
        myStack1.push(4);
        myStack1.push(5);
        myStack1.push(6);

        System.out.println("Cloning 1st stack..");
        MyStack myStack2 = (MyStack) (myStack1.clone());

        System.out.println("Popping object from 1st stack..");
        myStack1.pop();

        System.out.println("1st " + myStack1);
        System.out.println("2st " + myStack2);
        System.out.print("Is the 1st stack equal to the 2nd stack? ->" + (myStack1 == myStack2));
    }
}
