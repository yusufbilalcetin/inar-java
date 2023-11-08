package week_10.assignment;

public class QueueTest_10_10 {
    public static void main(String[] args) {
        Queue_10_10 queue = new Queue_10_10();

        System.out.println(queue.getSize());
        System.out.println(queue.empty());

        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(11);

        for (int i = 0; i < 40; i++) {
            queue.dequeue();
        }
        System.out.println(queue.lengthOfArray());

    }
}
