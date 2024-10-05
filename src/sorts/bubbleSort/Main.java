package sorts.bubbleSort;

import java.util.Arrays;

public class Main {

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {4, 2, 6, 5, 1, 3};
        bubbleSort(input);
        System.out.println(Arrays.toString(input));
    }

}
