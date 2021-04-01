package algo.sortings;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        InsertionSortImpl insertionSort = new InsertionSortImpl();
        InsertionSortReversedImpl insertionSortReversed = new InsertionSortReversedImpl();

        int[] array = {5, 3, 1, 2, 4, 7, 6, 9, 8};

        System.out.println(Arrays
                .toString(insertionSort.sort(Arrays.copyOf(array, array.length))));
        System.out.println(Arrays
                .toString(insertionSort.sortReversed(Arrays.copyOf(array, array.length))));
        System.out.println(Arrays
                .toString(insertionSortReversed.descSort(Arrays.copyOf(array, array.length))));
        System.out.println(Arrays
                .toString(insertionSortReversed.descSortReversed(Arrays.copyOf(array, array.length))));
    }
}
