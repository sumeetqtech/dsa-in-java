package datastructures.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    // almost like an append method for linked-list
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
        length++;
    }

    // almost like an removeFirst method for linked-list
    public Node dequeue() {

        if (length == 0) {
            return null;
        }

        Node current = first;
        first = current.next;
        current.next = null;
        length--;

        if (length == 0) {
            first = null;
            last = null;
        }

        return current;
    }
}
