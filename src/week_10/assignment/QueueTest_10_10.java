package week_10.assignment;

public class QueueTest_10_10 {
    public static void main(String[] args) {
        Queue_10_10 queue = new Queue_10_10();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
            System.out.print(i + " ");
        }
        System.out.println("\n\nProcess of Dequeue : ");
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
