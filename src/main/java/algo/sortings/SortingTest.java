package algo.sortings;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        InsertionSortImpl insertionSort = new InsertionSortImpl();
        InsertionSortReversedImpl insertionSortReversed = new InsertionSortReversedImpl();
        MergeSortImpl mergeSort = new MergeSortImpl();

        int[] array = {5, 3, 1, 2, 4, 10, 7, 6, 9, 8};

        System.out.println("Ins sort asc: \t\t\t" + Arrays
                .toString(insertionSort.sort(Arrays.copyOf(array, array.length))));
        System.out.println("Ins sort asc rev: \t\t" + Arrays
                .toString(insertionSort.sortReversed(Arrays.copyOf(array, array.length))));
        System.out.println("Ins sort desc: \t\t\t" + Arrays
                .toString(insertionSortReversed.descSort(Arrays.copyOf(array, array.length))));
        System.out.println("Ins sort desc rev: \t\t" + Arrays
                .toString(insertionSortReversed.descSortReversed(Arrays.copyOf(array, array.length))));
        System.out.println("Merge sort: \t\t\t" + Arrays
                .toString(mergeSort.sort(Arrays.copyOf(array, array.length), 0, array.length - 1)));
    }
}
