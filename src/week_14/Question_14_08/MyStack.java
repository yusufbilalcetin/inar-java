package week_14.Question_14_08;

import java.util.Queue;

public class MyStack<E> {
    private Queue<E> queue1;
    private Queue<E> queue2;
    private E topElement;

    public MyStack() {
        this.queue1 = queue1;
        this.queue2 = queue2;
    }

    public void push(E o) {
        queue1.offer(o);
        topElement = o;
    }

    public E pop() {
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            E obj = queue1.poll();
            while (!queue2.isEmpty()) {
                this.push(queue2.poll());
            }
            return obj;
        }
        throw new RuntimeException("The stack is empty");
    }

    public E top() {
        if (!queue1.isEmpty()) {
            return topElement;
        }
        throw new RuntimeException("The stack is empty");
    }

    public boolean empty() {
        return queue1.size() == 0;
    }
}
