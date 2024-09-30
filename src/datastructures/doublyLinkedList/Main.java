package datastructures.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.append(6);
        doublyLinkedList.append(7);
        doublyLinkedList.append(8);
        doublyLinkedList.printList();

        System.out.println("RemovedLast: " + doublyLinkedList.removeLast().value);
        doublyLinkedList.printList();

        System.out.println("Prepend: 0");
        doublyLinkedList.prepend(0);
        doublyLinkedList.printList();

        System.out.println("RemovedFirst: " + doublyLinkedList.removeFirst().value);
        doublyLinkedList.printList();

        System.out.println("Get at index 5 = " + doublyLinkedList.get(5).value);
        doublyLinkedList.printList();

        System.out.println("Insert at index 4: " + doublyLinkedList.insert(4, 5));
        doublyLinkedList.printList();

        System.out.println("Remove at index 4 = " + doublyLinkedList.remove(4).value);
        doublyLinkedList.printList();
    }
}
