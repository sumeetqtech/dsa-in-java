package datastructures.hashTable.groupAnagrams;

import java.util.*;


public class Main {

    public static List<List<String>> groupAnagrams(String[] strings) {
        // Create a map to hold groups of anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array
        for (String str : strings) {
            // Sort the characters of the string to create a key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            // Add the original string to the map under its sorted key
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));
    }

}

