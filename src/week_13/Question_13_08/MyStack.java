package week_13.Question_13_08;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public Object clone() throws CloneNotSupportedException {
        MyStack clone = (MyStack) (super.clone());
        clone.list = (ArrayList<Object>) (this.list.clone());
        return clone;
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}
