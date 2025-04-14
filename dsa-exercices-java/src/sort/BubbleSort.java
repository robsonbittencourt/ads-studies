package sort;

import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] input) {
        boolean isSorted = true;

        for (int k = 0; k < input.length; k++) {
            for (int i = 0; i < input.length - 1; i++) {
                int current = input[i];

                if (input[i] > input[i + 1]) {
                    isSorted = false;
                    input[i] = input[i + 1];
                    input[i + 1] = current;
                }
            }

            if (isSorted) {
                break;
            }
        }

        return input;
    }
}
