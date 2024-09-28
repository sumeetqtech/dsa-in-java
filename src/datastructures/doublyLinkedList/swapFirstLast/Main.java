package datastructures.doublyLinkedList.swapFirstLast;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);
        doublyLinkedList.append(6);

        doublyLinkedList.printList();

        doublyLinkedList.swapFirstLast();
        System.out.println("Swapped first and last:");

        doublyLinkedList.printList();
    }
}
