package week_14.Question_14_09;

import java.util.Stack;

public class MyQueue<E> {
    private Stack<E> stack1;
    private Stack<E> stack2;
    private E frontElement;

    public MyQueue() {
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    public void push(E o) {
        stack1.push(o);
        if (stack1.size() < 2) {
            frontElement = o;
        }
    }

    public E pop() {
        if (!stack1.empty()) {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            E obj = stack1.pop();
            while (!stack2.empty()) {
                this.push(stack2.pop());
            }
            return obj;
        }
        throw new RuntimeException("Queue is empty");
    }

    public E peek() {

        if (!stack1.empty()) {
            return frontElement;
        }
        throw new RuntimeException("Queue is empty");
    }
}
