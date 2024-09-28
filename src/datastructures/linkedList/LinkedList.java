package datastructures.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    /**
     * A node class
     */
    static class Node {

        int value;
        Node next;

        /**
         * Constructor
         * @param value - value for a node
         */
        Node(int value) {
            this.value = value;
        }
    }

    /**
     * Constructor to build a new linked list instance
     * @param value - the first value to be inserted into the linked list
     */
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /**
     * Prints the node values within a linked list
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /**
     * Utility method to return the head value for a linked list
     */
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    /**
     * Utility method to return the tail value for a linked list
     */
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    /**
     * Utility method to return the length of a linked list
     */
    public void getLength() {
        System.out.println("Length: " + length);
    }

    /**
     * Add a node to the end of the LinkedList
     * This operation is O(1) which is constant in nature
     * @param value - the value to be added
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
     * This operation is O(1) which is constant in nature
     * @param value - the value to be added
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
     * This operation is O(n) since we need to iterate
     * through all the items within the linked list
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
     * This operation is O(1) which is constant in nature
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
     * This operation is O(n) since we need to iterate
     * through 'n' number the items within the linked list
     * @param index - the index to get the value from
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
     * This operation is O(n) since we need to iterate
     * through 'n' number the items within the linked list to change its value
     * @param index - the index to change
     * @param value - the new value to be added at that index
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
     * @param index - the index to insert at
     * @param value - the new value to be inserted at that index
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
     * @param index - the index at which the value needs to be removed
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
