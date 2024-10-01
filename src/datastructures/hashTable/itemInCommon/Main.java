package datastructures.hashTable.itemInCommon;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        System.out.println(itemInCommon(array1, array2));
    }

    private static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i : array1) {
            hashMap.put(i, true);
        }

        for (int j : array2) {
            if (hashMap.containsKey(j)) {
                return true;
            }
        }

        return false;
    }
}
