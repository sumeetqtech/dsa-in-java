package array.interview.findMinMax;

import java.util.Arrays;

public class Main {

    public static int[] findMaxMin(int[] array) {

        if (array == null || array.length == 0) {
            return new int[]{0, 0};
        }

        int max = array[0];
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }

            if (j > max) {
                max = j;
            }
        }
        return new int[]{max, min};
    }


    public static void main(String[] args) {
        int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
        System.out.println(Arrays.toString(result1)); // prints "[9, 1]"

    }
}
