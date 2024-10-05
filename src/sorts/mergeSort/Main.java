package sorts.mergeSort;

import java.util.Arrays;

public class Main {

    private static int[] merge(int[] array1, int[] array2) {
        int[] combinedArray = new int[array1.length + array2.length];
        int indexOfCombine = 0;
        int index1 = 0;
        int index2 = 0;

        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] < array2[index2]) {
                combinedArray[indexOfCombine] = array1[index1];
                index1++;
            } else {
                combinedArray[indexOfCombine] = array2[index2];
                index2++;
            }
            indexOfCombine++;
        }

        while (index1 < array1.length) {
            combinedArray[indexOfCombine] = array1[index1];
            indexOfCombine++;
            index1++;
        }

        while (index2 < array2.length) {
            combinedArray[indexOfCombine] = array2[index2];
            indexOfCombine++;
            index2++;
        }

        return combinedArray;
    }

    /**
     * We will use recursion here...
     * O(n) for space complexity
     * 0(n log n) in terms of time complexity
     * @param array is the array to be sorted using merge sort
     * @return 's a new sorted array
     */
    public static int[] mergeSort(int[] array) {
        /* Steps:
         * 1. Break list in half
         * 2. Base case when length of the list becomes 1
         * 3. Use merge method above to put together things back
         */

        // base condition for a recursive approach
        if (array.length == 1) return array;

        int middleIndex = array.length / 2;

        /*
         * below we call the mergeSort method in recursion that is
         * repeatedly till the base condition is matched and the
         * method pops out of the call-stack
         */
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, middleIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, middleIndex, array.length));

        return merge(left, right);
    }


    public static void main(String[] args) {
        int[] array = {1, 3, 7, 8, 2, 4, 5, 6};
        int[] sorted = mergeSort(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }
}
