package datastructures.hashTable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screw", 140);
        hashTable.printTable();

        System.out.println("Get Method: " + hashTable.get("screw"));
        System.out.println(hashTable.keys().toString());
    }
}
