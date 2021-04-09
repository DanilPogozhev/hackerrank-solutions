package leetcode.sortings;

import java.util.Arrays;

public class Problem1502 {

    /**
     * Problem URL: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
     */
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1] - arr[i - 2] != arr[i] - arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

}
