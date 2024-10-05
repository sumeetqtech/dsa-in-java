package sorts.selectionSort;

import java.util.Arrays;

public class Main {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {10, 4, 5, 7, 8, 9, 1, 3, 2, 6};
        selectionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
