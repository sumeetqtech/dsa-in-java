package datastructures.doublyLinkedList;

import datastructures.linkedList.LinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
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

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;

        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node last = tail;
        if (length == 1) {
            tail = null;
            head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            last.prev = null;
        }
        length--;
        return last;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node first = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = first.next;
            head.prev = null;
            first.next = null;
        }

        length--;
        return first;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node current = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = length - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    public boolean set(int index, int value) {
        Node current = get(index);
        if (current != null) {
            current.value = value;
            return true;
        }
        return false;
    }

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
            Node before = get(index - 1);
            Node after = before.next;

            newNode.prev = before;
            newNode.next = after;
            before.next = newNode;
            after.prev = newNode;
            length++;
        }
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        } else {
            Node before = get(index - 1);
            Node current = before.next;
            Node after = current.next;

            before.next = after;
            after.prev = before;
            current.prev = null;
            current.next = null;
            length--;

            return current;
        }
    }
}
