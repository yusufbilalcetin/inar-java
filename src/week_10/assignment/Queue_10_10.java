package week_10.assignment;

public class Queue_10_10 {
    private int[] elements;
    private int size;

    public static final int DEFAULT_CAPACITY = 8;

    public Queue_10_10() {
        this(DEFAULT_CAPACITY);
    }

    public Queue_10_10(int capacity) {
        elements = new int[capacity];
    }


    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
        System.out.println("Element added to the array : Index is --> " + (size - 1) + " Value is --> " + v);
    }

    //{ 1 , 2, 3 ,4 }
    public int dequeue() {
        int v = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, size);
        elements = temp;
        System.out.println("Element extracted from the array : " + " Value is --> " + v);
        return v;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int lengthOfArray() {
        return elements.length;
    }
}
