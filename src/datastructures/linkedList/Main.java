package datastructures.linkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.prepend(0);
        linkedList.printList();

        System.out.println("RemovedLast: " + linkedList.removeLast().value);
        linkedList.printList();
        System.out.println("RemovedFirst: " + linkedList.removeFirst().value);
        linkedList.printList();

        linkedList.getLength();
        System.out.println("Get 1: " + linkedList.get(1).value);

        System.out.println("Set: " + linkedList.set(0, 0));
        System.out.println("Set: " + linkedList.set(1, 1));

        System.out.println("Insert at index: " + linkedList.insert(2, 3));
        System.out.println("Insert at index: " + linkedList.insert(2, 2));
        linkedList.getLength();
        linkedList.printList();

        System.out.println("Remove at Index: " + linkedList.remove(1).value);
        linkedList.printList();
        linkedList.getLength();

        linkedList.reverse();
        linkedList.printList();
    }
}
