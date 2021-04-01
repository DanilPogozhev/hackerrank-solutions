package algo.sortings;

public class InsertionSortImpl {

    public int[] sort(int[] baseArray) {
        for (int i = 1; i < baseArray.length; i++) {
            int key = baseArray[i];
            int j = i - 1;

            while (j >= 0 && baseArray[j] > key){
                baseArray[j + 1] = baseArray[j];
                j--;
            }

            baseArray[j + 1] = key;
        }

        return baseArray;
    }

    public int[] sortReversed(int[] baseArray) {
        for (int i = baseArray.length - 2; i >= 0; i--) {
            int key = baseArray[i];
            int j = i + 1;

            while (j <= baseArray.length - 1 && baseArray[j] < key){
                baseArray[j - 1] = baseArray[j];
                j++;
            }

            baseArray[j - 1] = key;
        }

        return baseArray;
    }
}
