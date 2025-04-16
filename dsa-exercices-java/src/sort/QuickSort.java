package sort;

public class QuickSort {

    public int[] sort(int[] input, int left, int right) {
        if (left < right) {
            int partition = partition(input, left, right);
            sort(input, left, partition -1);
            sort(input, partition + 1, right);
        }

        return input;
    }

    private int partition(int[] input, int left, int right) {
        int pivot = input[right];

        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (input[j] <= pivot) {
                i++;
                swap(input, i, j);
            }
        }

        swap(input, i + 1, right);

        return i + 1;
    }

    private void swap(int[] input, int first, int second) {
        int temp = input[second];
        input[second] = input[first];
        input[first] = temp;
    }
}
