package datastructures.linkedList;

public class Main {
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.prepend(0);
        linkedList.printList();

        System.out.println("RemovedLast: " + linkedList.removeLast().value);
        linkedList.printList();
        System.out.println("RemovedFirst: " + linkedList.removeFirst().value);
        linkedList.printList();

        System.out.println("Get at index 3: " + linkedList.get(3).value);

        System.out.println("Set: " + linkedList.set(0, 0));
        System.out.println("Set: " + linkedList.set(1, 1));
        linkedList.printList();

        System.out.println("Insert at index 2: " + linkedList.insert(2, 1));
        System.out.println("Insert at index 2: " + linkedList.insert(2, 2));
        linkedList.printList();

        System.out.println("Removed at index 3: " + linkedList.remove(3).value);
        linkedList.printList();

        System.out.println("Reversed LinkedList:");
        linkedList.reverse();
        linkedList.printList();
    }
}
