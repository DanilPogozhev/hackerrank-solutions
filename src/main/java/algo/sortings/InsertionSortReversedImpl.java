package algo.sortings;

public class InsertionSortReversedImpl {
    public int[] descSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < key){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        return array;
    }

    public int[] descSortReversed(int[] array) {
        for (int i = array.length - 2; i>= 0;  i--) {
            int key = array[i];
            int j = i + 1;

            while (j <= array.length - 1 && array[j] > key){
                array[j - 1] = array[j];
                j++;
            }

            array[j - 1] = key;
        }

        return array;
    }
}
