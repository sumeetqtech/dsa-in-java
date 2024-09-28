package datastructures.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(47);
        binarySearchTree.insert(21);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);

        System.out.println("root = " + binarySearchTree.root.value);
        System.out.println("Insert: " + binarySearchTree.insert(27));
        System.out.println(binarySearchTree.root.left.right.value);

        System.out.println(binarySearchTree.contains(21));
    }
}
