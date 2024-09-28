package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(1);

        queue.getFirst();
        queue.getLast();
        queue.getLength();

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Dequeue: " + queue.dequeue().value);

        queue.printQueue();

    }
}
