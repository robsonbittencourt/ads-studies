import sort.BubbleSort;
import sort.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] result = new BubbleSort().sort(new int[]{3, 2, 8, 4, 9});
//        System.out.println(Arrays.toString(result));

        int[] input = {3, 2, 8, 4, 9};
        int [] result = new QuickSort().sort(input, 0, input.length - 1);
        System.out.println(Arrays.toString(result));
    }
}