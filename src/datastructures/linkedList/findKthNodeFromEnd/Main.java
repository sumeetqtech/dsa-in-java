package datastructures.linkedList.findKthNodeFromEnd;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        System.out.println("The 2nd Kth Node from End: " + myList.findKthFromEnd(2).value);
    }
}
