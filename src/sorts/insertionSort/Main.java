package sorts.insertionSort;

import java.util.Arrays;

public class Main {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 3, 5, 6};
        insertionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
