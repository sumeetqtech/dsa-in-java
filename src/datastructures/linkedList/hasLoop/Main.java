package datastructures.linkedList.hasLoop;


public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        LinkedList.Node head = myList.getHead();
        LinkedList.Node tail = myList.getTail();
        tail.next = head;

        boolean hasLoop = myList.hasLoop();
        System.out.println("Has Loop: " + hasLoop);
    }
}
