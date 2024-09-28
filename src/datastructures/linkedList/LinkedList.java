package datastructures.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    /**
     * Add a node to the end of the LinkedList
     *
     * @param value
     */
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    /**
     * Add a node to the start of the LinkedList
     *
     * @param value
     */
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            tail = newNode;
        } else {
            newNode.next = head;
        }
        head = newNode;
        length++;
    }

    /**
     * removes last item from the LinkedList
     *
     * @return Node
     */
    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node current = head;
        Node prev = head;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        tail = prev;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return current;
    }

    /**
     * removes first item from the LinkedList
     *
     * @return Node
     */
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node current = head;
        head = head.next;
        current.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return current;
    }

    /**
     * Returns a node at the specified index within the LinkedList
     *
     * @param index
     * @return Node
     */
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * Replaces the value at a specified index within the LinkedList
     *
     * @param index
     * @param value
     * @return Node
     */
    public boolean set(int index, int value) {
        Node current = get(index);
        if (current != null) {
            current.value = value;
            return true;
        }
        return false;
    }

    /**
     * Inserts a node at a specified index within the LinkedList
     * @param index
     * @param value
     * @return boolean
     */
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node newNode = new Node(value);
            Node prev = get(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
            length++;
        }

        return true;
    }

    /**
     * Removes a node at a specified index within the LinkedList
     * @param index
     * @return Node
     */
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node current = prev.next;
        prev.next = current.next;
        current.next = null;
        length--;
        return current;
    }

    /**
     * Reverses the LinkedList
     */
    public void reverse() {
        Node current = head;
        head = tail;
        tail = current;

        Node before = null;
        Node after;

        for (int i = 0; i < length ; i++) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
    }
}
