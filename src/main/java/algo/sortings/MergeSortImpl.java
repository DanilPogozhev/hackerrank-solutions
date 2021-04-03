package algo.sortings;

public class MergeSortImpl {
    public int[] sort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(array, p, q);
            sort(array, q + 1, r);
            merge(array, p, q, r);
        }

        return array;
    }

    private int[] merge(int[] array, int p, int q, int r) {
        int leftLength = q - p + 1;
        int rightLength = r - q;

        int[] leftArray = new int[leftLength + 1];
        int[] rightArray = new int[rightLength + 1];

        if (leftLength >= 0) System.arraycopy(array, p, leftArray, 0, leftLength);

        leftArray[leftArray.length - 1] = Integer.MAX_VALUE;

        for (int i = 0; i < rightLength; i++) {
            rightArray[i] = array[q + 1 + i];
        }

        rightArray[rightArray.length - 1] = Integer.MAX_VALUE;

        int leftCounter = 0;
        int rightCounter = 0;
        for (int k = p; k < r + 1; k++) {
            if (leftArray[leftCounter] <= rightArray[rightCounter]) {
                array[k] = leftArray[leftCounter];
                leftCounter++;
            } else {
                array[k] = rightArray[rightCounter];
                rightCounter++;
            }
        }

        return array;
    }
}
