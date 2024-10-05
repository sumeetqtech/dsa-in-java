package array.interview.removeElement;

import java.util.Arrays;

public class Main {
    public static int removeElement(int[] nums, int val) {
        int newLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }

        return newLength;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] numbs = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val1 = 1;
        System.out.println("Original Array: " + Arrays.toString(numbs));
        int newLength1 = removeElement(numbs, val1);
        System.out.println("Modified Array: " + Arrays.toString(numbs));
        System.out.println(Arrays.toString(Arrays.copyOfRange(numbs, 0, newLength1)) +
                "\nNew length: " + newLength1);

    }
}
