package leetcode.arrays;

public class Problem35 {
    public int searchInsert(int[] array, int target) {
        if (array.length == 1) {
            if (target <= array[0]) {
                return 0;
            } else {
                return 1;
            }
        }

        int counter = 0;

        while (counter < array.length && target > array[counter]) {
            counter++;
        }

        return counter;
    }
}
