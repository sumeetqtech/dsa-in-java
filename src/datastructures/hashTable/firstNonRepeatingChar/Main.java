package datastructures.hashTable.firstNonRepeatingChar;

import java.util.*;


public class Main {

    public static Character firstNonRepeatingChar(String input) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (char c : input.toCharArray()) {
            if (hashMap.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
    }

}

