package leetcode.sortings;

/**
 * Problem URL: https://leetcode.com/problems/sort-array-by-parity-ii/
 */
public class Problem922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];

        int even = 0;
        int odd = 1;
        for (int number : nums) {
            if (number % 2 == 0) {
                result[even] = number;
                even += 2;
            } else {
                result[odd] = number;
                odd += 2;
            }
        }

        return result;
    }

    /**
     * Author URL: https://leetcode.com/user2406z/
     * Solution URL: https://leetcode.com/problems/sort-array-by-parity-ii/discuss/181500/Java-Two-pointers-inplace-O(n)-time-simple-and-straightforward
     */
    public int[] bestRatedSolution(int[] A) {
        int e = 0;
        int o = 1;

        while (e < A.length && o < A.length) {
            if (A[e] % 2 != 0) {
                swap(A, e, o);
                o += 2;
            } else {
                e += 2;
            }
        }

        return A;
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
