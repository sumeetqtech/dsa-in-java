package datastructures.linkedList.partitionList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(3);
        linkedList.append(8);
        linkedList.append(5);
        linkedList.append(10);
        linkedList.append(2);
        linkedList.append(1);

        linkedList.partitionList(5);
//        linkedList.printList();

    }
}
