package datastructures.hashTable.findDuplicates;

import java.util.*;


public class Main {

    public static List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            // Increment count of each number
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            // If the count reaches 2, add it to duplicates
            if (countMap.get(num) == 2) {
                duplicates.add(num);
            }
        }
        // Convert set of duplicates to a list
        return new ArrayList<>(duplicates);
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }

}

